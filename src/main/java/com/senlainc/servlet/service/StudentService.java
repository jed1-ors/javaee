package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import com.senlainc.servlet.repository.StudentRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class StudentService {

    @Inject
    private StudentRepository studentRepository;

    public Student getStudent(long id) {
        return this.studentRepository.getStudent(id);
    }

    public List<Student> getStudents() {
        return this.studentRepository.getStudents();
    }
}