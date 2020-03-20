package com.test.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.control.Alert;
//@WebServlet("/login")
	public class login extends HttpServlet {
	 
	    private static final long serialVersionUID = 1L;
	 
	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String name = request.getParameter("name");
	        String password = request.getParameter("password");
	 
	        if ("admin".equals(name) && "123".equals(password)) {
	            request.getSession().setAttribute("userName", name);
	            response.sendRedirect("listhero");
	        } else {
	            response.sendRedirect("/Hero/login.html");
	        }
	 
	    }
}

