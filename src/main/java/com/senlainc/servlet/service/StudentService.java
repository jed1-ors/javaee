package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class StudentService {

    @PersistenceContext(unitName = "PostgresPU")
    private EntityManager em;

    public Student getStudent(long id) {
        return em.find(Student.class, id);
    }
}