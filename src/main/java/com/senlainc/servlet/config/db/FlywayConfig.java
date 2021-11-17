package com.senlainc.servlet.config.db;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.ejb.TransactionManagement;
import jakarta.ejb.TransactionManagementType;
import org.flywaydb.core.Flyway;

@Startup
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class FlywayConfig {

    @PostConstruct
    public void init() {
        System.out.println("Starting to migrate the database schema with Flyway");
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/javaee", "postgres", "postgres")
                .schemas("public")
                .load();
        flyway.migrate();
        System.out.println("Successfully applied latest schema changes");
    }
}
