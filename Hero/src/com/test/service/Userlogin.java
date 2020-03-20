package com.test.service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.Herodao.Userdao;
import com.test.hero.User;

public class Userlogin   extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		 String sname = request.getParameter("name");
	        String spassword = request.getParameter("password");
	        //if(name!=null)
	        	//System.out.print("dsadds");
	        //Userdao a = new Userdao();
	        User user = new Userdao().getUser(sname,spassword);
	        //if(user!=null)
	        	//System.out.print(user.name);
	        if (null != user) {
	            request.getSession().setAttribute("user", user);
	            response.sendRedirect("u_listhero");
	        } else
	        	//response.sendRedirect("listhero");
	            response.sendRedirect("/Hero/login.html");
		
	}
	
	

}
