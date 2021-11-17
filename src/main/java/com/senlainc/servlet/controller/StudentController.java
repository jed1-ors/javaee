package com.senlainc.servlet.controller;

import com.senlainc.servlet.entity.Student;
import com.senlainc.servlet.service.StudentService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("student")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudentController {

//    @Resource(lookup = "jdbc/postgresql")
//    private DataSource dataSource;

    @PersistenceContext(unitName = "PostgresPU")
    private EntityManager entityManager;

    @Inject
    private StudentService studentService;

    @GET
    public Response getStudent(@PathParam("{id}") long id) {
        return Response.ok(this.studentService.getStudent(id)).build();
    }

//    @GET
//    @Path("/database")
//    public JsonObject getDatabaseInformation() {
//        try (Connection con = dataSource.getConnection()) {
//            return Json.createObjectBuilder()
//                    .add("databaseName", con.getMetaData().getDatabaseProductName())
//                    .add("versionMajor", con.getMetaData().getDatabaseMajorVersion())
//                    .add("versionMinor", con.getMetaData().getDatabaseMinorVersion())
//                    .build();
//        } catch (SQLException e) {
//            return Json.createObjectBuilder().add("message", "error").build();
//        }
//    }

    @GET
    public Response getAllStudents() {
        List<Student> allStudents = this.entityManager
                .createQuery("SELECT s FROM Student s", Student.class)
                .setMaxResults(10)
                .getResultList();

        return Response.ok(allStudents).build();
    }
}