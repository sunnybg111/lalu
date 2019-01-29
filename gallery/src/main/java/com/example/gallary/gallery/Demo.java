package com.example.gallary.gallery;

import com.example.gallary.gallery.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest/demo")
public class Demo
 {
     @Autowired
     Environment environment;
     @RequestMapping(value = "/echoStudentName/{name}")
     public String echoStudentName(@PathVariable(name = "name") String name)
     {
	 System.out.println("Inside MyRestController::backend...");
 
        String serverPort = environment.getProperty("local.server.port");
 
        System.out.println("Port : " + serverPort);

         return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
     }



     @RequestMapping(value = "/getStudentDetails/{name}")
     public Student getStudentDetails(@PathVariable(name = "name") String name)
     {
		 System.out.println("Inside MyRestController::backendddddddd...");

         System.out.println("Inside MyRestController::backend...coooooooooooolll2");


         System.out.println("Inside MyRestController::backend...coooooooooooo55555");

         String serverPort = environment.getProperty("local.server.port");
 
        System.out.println("Port : " + serverPort);
         return new Student(name, "Pune", "MCA");
     }

}