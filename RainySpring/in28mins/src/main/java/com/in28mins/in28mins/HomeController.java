package com.in28mins.in28mins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceResourceBundle;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HomeController{


    @Autowired
    private MessageSource messageSource;

    /*@RequestMapping(method  = RequestMethod.GET, path="/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }*/

    /*@GetMapping(path="/hi")
    public String HiWorld(){
        return "Hi World";
    }*/

    @GetMapping(path="/hito-bean")
    public Homebean hombean(){
            return new Homebean("8900--9");
    }

    @GetMapping(path="/hito-bean/path-variable/{name}")
    public Homebean hombeanPathVariable(@PathVariable String name){
        return new Homebean(String.format("Hello-World, %s", name));
    }

    @GetMapping(path="/hello-world-internationalized")
    public String interNational(@RequestHeader(name="Accept-Language",  required=false)Locale locale){

        return messageSource.getMessage("good.morning.message",
                null, Locale.US);
    }

}

