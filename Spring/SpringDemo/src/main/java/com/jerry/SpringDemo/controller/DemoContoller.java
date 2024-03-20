package com.jerry.SpringDemo.controller;

import com.jerry.SpringDemo.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {

    @GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Acharya", "Prashant");
    }

}
