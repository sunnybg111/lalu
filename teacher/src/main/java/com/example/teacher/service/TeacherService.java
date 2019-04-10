package com.example.teacher.service;

import com.example.teacher.domain.Teacher;

public interface TeacherService {

    Teacher findByName(String name);
}
