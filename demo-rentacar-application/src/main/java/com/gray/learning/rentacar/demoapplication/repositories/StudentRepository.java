package com.gray.learning.rentacar.demoapplication.repositories;

import com.gray.learning.rentacar.demoapplication.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 15-Apr-22
 * Time: 5:17 PM
 * demo-rentacar-application
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<List<Student>> findAllByFirstNameStartingWith(String name);
    Optional<Student> findStudentById(int id);
}
