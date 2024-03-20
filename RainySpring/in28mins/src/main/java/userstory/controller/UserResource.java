package userstory.controller;

import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.Resource;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import userstory.exception.UserNotFoundException;
import userstory.model.Users;
import userstory.service.UserStoryDaoService;


import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserStoryDaoService userStoryDaoService;

    @GetMapping("/get-all-users")
    public List<Users>  retrieveAll(){
      return userStoryDaoService.findAll();
    }

    @GetMapping("/get-byId/{id}")
    public Users findById(@PathVariable int id) throws UserNotFoundException {
        Users users  = userStoryDaoService.findOne(id);
        if(users==null){
            throw new UserNotFoundException("id-"+id);
        }
        // "all-users", SERVER_PATH + "/users"
        //retrieveAllUsers
        //HATEOAS


        return users;
    }

    @PostMapping(path="/save-user")
    public ResponseEntity<Object> createUser(@Valid @RequestBody Users user){
        Users savedUser = userStoryDaoService.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/user/{id}")
    public void deleteUser(@PathVariable int id){
        Users users = userStoryDaoService.deleteById(id);

        if(users==null){
            throw new UserNotFoundException("id-"+id);
        }
    }




}
