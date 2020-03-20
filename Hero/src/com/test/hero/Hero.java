package com.test.hero;

public class Hero {
	
	public int id;
	public String name;
	public int hp;
	public int damage;
	
	
	public Hero()
	{
		
	}
	
	
	
	public Hero(int id, String name, int hp, int damage) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	/*public String toString()
	{
		return  "英雄id  "+ id +" " + "英雄名字  " +name +" "+ "英雄血量  " + hp+ " " + "英雄伤害  " + damage; 
	}  */
	
	

}
