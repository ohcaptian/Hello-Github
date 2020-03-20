package com.test.service;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import com.test.hero.Hero;
import com.test.Herodao.Herodao;

import javax.servlet.ServletException;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//@WebServlet("/listhero")
public class Herolist extends HttpServlet {	 
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            
	    			List<Hero> heros = new Herodao().list();
	    			request.setAttribute("heros", heros);
	    			request.getRequestDispatcher("herolist.jsp").forward(request, response);
	
	}
	
	
}
	
	
