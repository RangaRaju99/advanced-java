package com.lpu.service;


import java.util.List;

import com.entity.Student;
import com.lpu.dao.StudentDao;
import com.lpu.dao.impl.StudentDaoImpl;
import com.lpu.exception.StudentNotFoundException;

public class StudentService {

    private StudentDao dao = new StudentDaoImpl();

    public void register(Student s){

        if(String.valueOf(s.getPhone()).length() != 10)
            throw new IllegalArgumentException("Invalid phone number");

        dao.save(s);
    }

    public Student getStudent(int id){

        Student s = dao.findById(id);

        if(s == null || s.isDeleted())
            throw new StudentNotFoundException("Student not found!");

        return s;
    }

    public List<Student> getAll(int page, int size){
        return dao.findAll(page, size);
    }

    public void updateName(int id, String name){

        Student s = getStudent(id);
        s.setName(name);

        dao.update(s);
    }

    public void updatePhone(int id, long phone){

        Student s = getStudent(id);
        s.setPhone(phone);

        dao.update(s);
    }

    public void delete(int id){

        Student s = getStudent(id);
        dao.delete(s);
    }
}

