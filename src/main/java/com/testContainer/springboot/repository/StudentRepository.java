package com.testContainer.springboot.repository;

import com.testContainer.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("INSERT INTO Student (firstName, lastName, email) VALUES (:firstName, :lastName, :email)")
    Student createStudent(Student student);

    @Query("SELECT s FROM Student s")
    List<Student> getAllStudents();


}
