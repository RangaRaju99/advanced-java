package com.lpu.dao;


import java.util.List;
import com.entity.Student;

public interface StudentDao{

    void save(Student s);

    Student findById(int id);

    List<Student> findAll(int page, int size);

    void update(Student s);

    void delete(Student s);
}