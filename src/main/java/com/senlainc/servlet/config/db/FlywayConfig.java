package com.senlainc.servlet.config.db;

import com.senlainc.servlet.annotation.Students;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.flywaydb.core.Flyway;

@Startup
@Singleton
//@TransactionManagement(TransactionManagementType.BEAN)
public class FlywayConfig {

//    @Produces
//    @PersistenceContext(unitName="defaultEntityManagerFactory")
//    @Students
//    EntityManagerFactory defaultEntityManagerFactory;


    private EntityManagerFactory emf;

    //    @PostConstruct
    public void init() {
        System.out.println("Starting to migrate the database schema with Flyway");
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/javaee", "postgres", "postgres")
                .schemas("public")
                .load();
        flyway.migrate();
        System.out.println("Successfully applied latest schema changes");
    }

    @PostConstruct
    public void setupEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("default");
    }

    @Produces
    @Students
    public EntityManager start() {
        return emf.createEntityManager();
    }

    public void close(@Disposes @Students EntityManager em) {
        emf.close();
    }

}
