package com.gray.learning.rentacar.demoapplication.controllers;

import com.gray.learning.rentacar.demoapplication.models.Student;
import com.gray.learning.rentacar.demoapplication.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 15-Apr-22
 * Time: 3:03 PM
 * demo-rentacar-application
 */

@RestController
public class MainController {

    StudentServiceImpl studentService;

    @Autowired
    public MainController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello Springboot";
    }

    @PostMapping("/student")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        Student save = studentService.save(student);
        if (save == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(save);
        }
    }

    @GetMapping("/studentbyid/{id}")
    public ResponseEntity<Student> fetchStudentByID(@PathVariable int id) {
        Student studentById = studentService.fetchStudentById(id);
        if (studentById == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(studentById);
        }
    }
    @GetMapping("/student/{name}")
    public ResponseEntity<List<Student>> fetchStudentByFirstName(@PathVariable String name){
        List<Student> studentList = studentService.fetchStudentByFirstName(name);
        if(studentList==null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(studentList);
        }
    }
}
