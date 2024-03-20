package userstory.service;


import org.springframework.stereotype.Component;
import userstory.model.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserStoryDaoService {

    private static List<Users> usersList = new ArrayList<>();

    private static int userCount=3;

    static{
        usersList.add(new Users(1,new Date(), "Amish1"));
        usersList.add(new Users(2,new Date(), "Tunnissh2"));
        usersList.add(new Users(3,new Date(), "Veds3"));
    }

    public List<Users>  findAll(){
        return usersList;
    }

    public Users save(Users user){
        if(user.getId()==null)
        {
            user.setId(++userCount);
        }
        usersList.add(user);
        return user;
    }
    public Users findOne(int id){
        for(Users user: usersList){
            if(user.getId() ==  id){
                return user;
            }

        }
            return null;
    }

    public Users deleteById(int id){
        Iterator<Users> iterator = usersList.iterator();
        while(iterator.hasNext()){
            Users users =  iterator.next();
            if(users.getId() ==  id){
                iterator.remove();
                return users;
            }
        }
        return null;
    }
}
