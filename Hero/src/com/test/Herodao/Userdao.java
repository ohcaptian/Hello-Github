package com.test.Herodao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.test.hero.User;
public class Userdao {
	public Userdao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  Connection  getconnnection() throws SQLException 
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hero","root","root");
		
	}
	
	public  User getUser(String name,String password)
	{
		User result = null;
	 try
	 {
	 Connection c = getconnnection();
	 String sql = "select * from  user where user_name = ? and user_password = ?";
     PreparedStatement ps = c.prepareStatement(sql);
     ps.setString(1, name);
     ps.setString(2, password);
     ResultSet rs = ps.executeQuery();

     if (rs.next()){
         result = new User();
         result.setId(rs.getInt(1));
         result.setPassword(password);
         result.setName(name);
     }

     ps.close();
     c.close();
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	  
	 return result;
	 
	}	
	
   

}
