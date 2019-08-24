package com.example.gallary.gallery.controllers;

import com.example.gallary.gallery.domain.Student;
import com.example.gallary.gallery.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest/demo")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class Demo
 {


     private static final Logger LOG = LoggerFactory.getLogger(Demo.class);
     @Autowired
     StudentService studentService;

     @Autowired
     Environment environment;

     @ApiOperation(value="This api is returning only hello", response = String.class)
     @RequestMapping(value = "/echoStudentName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
     public String echoStudentName(@PathVariable(name = "name") String name)
     {

         //LOG.trace("A TRACE Messageeeeeeeeeeeeeeee");
         //LOG.debug("A DEBUG Messageeeeeeeeeeeeeeeeeeeee");
         LOG.info("An INFO Messageeeeeeeeeeeeeeee");
         //LOG.warn("A WARN Messageeeeeeeeeeeeeeeeeeeeeeeeeeeee");
         //LOG.error("An ERROR Messageeeeeeeeeeeeeeeeee");
         if(!name.equals("cool"))throw new RuntimeException("Error while calculating for lamp");
	 System.out.println("Inside MyRestController::backend...");
 
        String serverPort = environment.getProperty("local.server.port");
 
        System.out.println("Port : " + serverPort);

         return "hello";
     }


     @ApiOperation(value="This api is returning student details", response = Student.class)
     @RequestMapping(value = "/getStudentDetails/{email}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
     public Student getStudentDetails(@PathVariable(name = "email") String email)
     {


         if(!email.equals("cool")) {
             LOG.info("Everything is perfect"+email);

             throw new RuntimeException("Error while calculating for lamp");
         }
        Student student= studentService.findByEmail(email);



		 //         String serverPort = environment.getProperty("local.server.port");
 
  //      System.out.println("Port : " + serverPort);
         return student;
     }

}