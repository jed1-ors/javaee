package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;

@ApplicationScoped
public class StudentService {

    public Student getStudent() {
        return Student.builder()
                .firstName("Test")
                .lastName("Testov")
                .middleName("Testovich")
                .birthday(LocalDate.of(1991, 12, 10))
                .build();
    }
}