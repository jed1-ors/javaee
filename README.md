Technologies used: `Apache Tomee EE Plume, JAX-RS, CDI, JTA, JPA, JSP, Flyway`

create db `javaee`, postgresql

`mvn clean package tomee:run -Ptomee`

students list on JSP -> `http://localhost:8080/javaee/rest`

JAX-RS -> `http://localhost:8080/javaee/rest/student/1`
