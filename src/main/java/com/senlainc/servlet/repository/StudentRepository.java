package com.senlainc.servlet.repository;

import com.senlainc.servlet.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

@ApplicationScoped
public class StudentRepository {

    @Inject
    private EntityManager entityManager;

    public Student getStudent(Long id) {
        return entityManager.find(Student.class, id);
    }

    public List<Student> getStudents() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> rootEntry = cq.from(Student.class);
        CriteriaQuery<Student> all = cq.select(rootEntry);
        TypedQuery<Student> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
}
