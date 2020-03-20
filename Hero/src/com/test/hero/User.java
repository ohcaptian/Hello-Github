package com.test.hero;

public class User {
	public int Id;
	public String name;
	public String password;
	
	/*public User(String name, String password) {
		this.name = name;
		this.password = password;
	}  */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int  getId() {
		return Id;
	}

	public void setId(int Id) {
		// TODO Auto-generated method stub
		this.Id = Id;
	}
	

	/*public String toString()
	{
		return  "英雄id  "+ Id +" " + "英雄名字  " +name +" "+ "英雄血量  " + password; 
	}  */ 
				
}
