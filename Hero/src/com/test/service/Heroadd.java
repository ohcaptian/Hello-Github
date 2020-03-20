package com.test.service;


import com.test.Herodao.Herodao;
import com.test.hero.Hero;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Heroadd")
public class Heroadd  extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		request.setCharacterEncoding("UTF-8");	
		Hero hero = new Hero();
		hero.setId(Integer.parseInt(request.getParameter("id")));
		hero.setName(request.getParameter("name"));
		hero.setHp(Integer.parseInt(request.getParameter("hp")));
		hero.setDamage(Integer.parseInt(request.getParameter("damage")));
		new Herodao().addhero(hero);
		response.sendRedirect("listhero");
		
		
		
	}
	

}
