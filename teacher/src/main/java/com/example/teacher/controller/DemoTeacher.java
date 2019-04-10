package com.example.teacher.controller;

import com.example.teacher.domain.Teacher;
import com.example.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTeacher {

    @Autowired
    TeacherService teacherService;


    @GetMapping(value="/cool/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher getTeacherDetail(@PathVariable(name="name") String name)
    {
        return teacherService.findByName(name);

    }
}
