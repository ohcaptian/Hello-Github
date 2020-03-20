package com.test.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.Herodao.Herodao;
import com.test.hero.Hero;


@WebServlet("/Hero")
public class Heroedit extends HttpServlet{
	
			protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
				//int id = 3;
				 int id = Integer.parseInt(request.getParameter("id"));
				 Hero hero = new Herodao().get(id);
			     request.setAttribute("hero", hero);
			     request.getRequestDispatcher("edit.jsp").forward(request, response);
				
				
				
			}

}
