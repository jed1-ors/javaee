package com.senlainc.servlet.controller;

import com.senlainc.servlet.service.StudentService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;

@Path("/")
@RequestScoped
public class StudentWebController {

    @Inject
    private StudentService studentService;

    @GET
    public void main(@Context HttpServletRequest request,
                     @Context HttpServletResponse response) throws Exception {
        request.setAttribute("students", studentService.getStudents());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
