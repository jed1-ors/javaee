package com.senlainc.servlet.service;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class StudentService {
//
//    @PersistenceContext(unitName = "default", type = PersistenceContextType.EXTENDED)
//    private EntityManager entityManager;

    public Student getStudent(long id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        return entityManager.find(Student.class, id);
    }
}