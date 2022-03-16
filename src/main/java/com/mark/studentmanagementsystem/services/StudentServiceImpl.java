package com.mark.studentmanagementsystem.services;

import com.mark.studentmanagementsystem.models.Student;
import com.mark.studentmanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements IStudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> list() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public Optional<Student> findById(Long studentid) {
        return studentRepository.findById(studentid);
    }


    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
