package com.gray.learning.rentacar.demoapplication.services.impl;

import com.gray.learning.rentacar.demoapplication.models.Student;
import com.gray.learning.rentacar.demoapplication.repositories.StudentRepository;
import com.gray.learning.rentacar.demoapplication.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 15-Apr-22
 * Time: 5:16 PM
 * demo-rentacar-application
 */
@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.studentRepository = repository;
    }

    @Override
    public Student save(Student student) {
        Student save = studentRepository.save(student);
        return save;
    }

    public Student fetchStudentById(int id) {
        Optional<Student> student = studentRepository.findStudentById(id);
        return student.orElse(null);
    }

    public List<Student> fetchStudentByFirstName(String name) {
        Optional<List<Student>> allByFirstName = studentRepository.findAllByFirstNameStartingWith(name);
        return allByFirstName.orElse(null);
    }

}
