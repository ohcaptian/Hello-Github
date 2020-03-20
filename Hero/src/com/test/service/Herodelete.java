package com.test.service;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.Herodao.Herodao;

public class Herodelete extends HttpServlet{
	
	public void service(HttpServletRequest request ,HttpServletResponse response)
	{
		
		 int id = Integer.parseInt(request.getParameter("id"));
         
	       new Herodao().delete(id);
	       try {
			response.sendRedirect("listhero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
