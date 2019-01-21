package com.school.school.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class School {

        @Autowired
        RestTemplate restTemplate;

        @RequestMapping(value = "/getSchoolDetails/{name}", method = RequestMethod.GET)
        public String getStudents(@PathVariable String name)
        {
            System.out.println("Getting School details for " + name);

            String response = restTemplate.exchange("http://GALLERYSERVICE/rest/demo/getStudentDetails/{name}",
                    HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, name).getBody();

            System.out.println("Response Received as " + response);

            return "School Name -  " + name + " \n Student Details " + response;
        }

        @Bean
        @LoadBalanced
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

