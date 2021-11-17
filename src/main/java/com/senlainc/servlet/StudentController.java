package com.senlainc.servlet;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.Response.ok;

@Path("student")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class StudentController {

    @Inject
    private StudentService studentService;

    @GET
    @Path("{name}")
    public Response greeting(@PathParam("name") String name) {
        return ok(this.studentService.buildGreetingMessage(name)).build();
    }
}