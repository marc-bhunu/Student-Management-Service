package com.mark.studentmanagementsystem.services;

import com.mark.studentmanagementsystem.models.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    List<Student> list();

    Student get(Long id);

    Optional<Student> findById(Long studentid);

    void delete(Long id);

    Student create(Student student);

    Student update(Student student);
}
