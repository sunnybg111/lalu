package com.example.teacher.dao;

import com.example.teacher.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDAO extends JpaRepository<Teacher,Long> {

Teacher findByName(String name);

}
