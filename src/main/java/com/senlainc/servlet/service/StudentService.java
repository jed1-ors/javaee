package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class StudentService {

    @PersistenceContext(unitName = "default", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public Student getStudent(long id) {
        return this.entityManager.find(Student.class, id);
    }
}