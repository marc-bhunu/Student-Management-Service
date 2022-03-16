package com.mark.studentmanagementsystem.controllers;
import com.mark.studentmanagementsystem.models.Student;
import com.mark.studentmanagementsystem.services.IStudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    IStudentService studentService;

    public StudentController(IStudentService studentService){
        this.studentService = studentService;

    }

    @Operation(summary = "Get All Students",description = "Get list of all students")
    @GetMapping("/all")
    public List<Student> list(){
        return studentService.list();

    }
    @Operation(summary = "Get Student By Auto Generated ID",description = "Get Student By Autogenerated ID")
    @GetMapping("/{id}")
    public Student get(@PathVariable Long id){
        return studentService.get(id);
    }

    @Operation(summary = "Add Student",description = "Add a student")
    @PostMapping("/add")
    public Student create(@RequestBody final Student student){
        return studentService.create(student);
    }

    @Operation(summary = "Get Student By Allocated ID",description = "Find Student By Allocated ID")
    @GetMapping("/{studentid}")
    private Optional<Student> findById(@PathVariable Long studentid){
        return  studentService.findById(studentid);
    }

    @Operation(summary = "Get Student By Id",description = "Deleting Student By Auto Id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        studentService.delete(id);
    }
    @Operation(summary = "Update A Student",description = "Update A Student By Auto Id")
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student){
        Student existingStudent = studentService.update(student);
        BeanUtils.copyProperties(student, existingStudent, "id");
        return studentService.update(existingStudent);
    }


}
