package com.senlainc.servlet.controller;

import com.senlainc.servlet.service.StudentService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("student")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudentController {

    @Inject
    private StudentService studentService;

    @GET
    public Response getStudent(@PathParam("{id}") long id) {
        return Response.ok(this.studentService.getStudent(id)).build();
    }
}