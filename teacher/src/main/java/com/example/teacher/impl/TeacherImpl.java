package com.example.teacher.impl;

import com.example.teacher.dao.TeacherDAO;
import com.example.teacher.domain.Teacher;
import com.example.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TeacherImpl implements TeacherService {

    @Autowired
    TeacherDAO teacherDAO;
    @Override
    public Teacher findByName(String name) {
        return teacherDAO.findByName(name);
    }
}
