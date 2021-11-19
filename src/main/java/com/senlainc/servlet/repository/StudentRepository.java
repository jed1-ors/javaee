package com.senlainc.servlet.repository;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class StudentRepository {

    @Inject
    private EntityManager entityManager;

    public Student getStudent(Long id) {
        return entityManager.find(Student.class, id);
    }
}
