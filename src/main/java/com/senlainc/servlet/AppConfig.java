package com.senlainc.servlet;

import com.senlainc.servlet.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class AppConfig {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        final Student student = Student.builder()
                .firstName("Test")
                .lastName("Testov")
                .middleName("Testovich")
                .birthday(LocalDate.of(1991, 12, 10))
                .build();

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.clear();
        entityManagerFactory.close();
    }
}