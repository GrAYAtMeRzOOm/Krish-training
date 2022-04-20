package com.gray.learning.rentacar.demoapplication.services;

import com.gray.learning.rentacar.demoapplication.models.Student;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 15-Apr-22
 * Time: 5:15 PM
 * demo-rentacar-application
 */
public interface StudentService {
    public Student save(Student student);
}
