package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class StudentService {

    @Inject
    EntityManager entityManager;

    public Student getStudent(Long id) {
        return entityManager.find(Student.class, id);
    }
}