package com.test.Herodao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.test.hero.Hero;
public class Herodao {
			
			public Herodao() 
			{
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		    public Connection getConnection() throws SQLException 
		    {
		    return DriverManager.getConnection("jdbc:mysql://localhost:3306/hero","root","root");	
		    }
			

			public int getTotal() {
					int total = 0;
					try (Connection c = getConnection(); Statement s = c.createStatement();) {

							String sql = "select count(*) from myhero";

									ResultSet rs = s.executeQuery(sql);
										while (rs.next()) {
												total = rs.getInt(1);
														}
											System.out.println("total:" + total);
								} catch (SQLException e) {
									e.printStackTrace();
														}
								return total;
										}
			//添加英雄
			public void addhero(Hero hero)
			{
				String sql = "insert into myhero(id,h_name,hp,damage)  values(?,?,?,?)";
						try(Connection conn = getConnection();PreparedStatement ps = conn.prepareStatement(sql))
						{
							ps.setInt(1, hero.id);
				            ps.setString(2, hero.name);
				            ps.setInt(3, hero.hp);
				            ps.setInt(4, hero.damage);
				            ps.executeUpdate();
				           // ResultSet rs = ps.getGeneratedKeys();
				           // if (rs.next()) {
				               // int id = rs.getInt(1);
				               // hero.id = id;
				            //}
						}catch(SQLException e)
							{
							e.printStackTrace();
							}

			}
			//删除英雄
			public void delete(int id)
			{
				try(Connection c = getConnection();Statement s = c.createStatement())
				{

					String sql = "delete from myhero where id ="+id;
					s.execute(sql);
				}catch(Exception e)
				{
					
					e.printStackTrace();
				}
				
				
			}
			
			//获取英雄列表
			public List <Hero> list()
			{
				return list(0,Short.MAX_VALUE);
			}
			
		public List<Hero> list(int start, int count)
		{
			 List<Hero> heros = new ArrayList<Hero>();
			String sql = "select * from myhero order by id limit ?,? ";
			try(Connection conn = getConnection();PreparedStatement s = conn.prepareStatement(sql))
			{
				s.setInt(1, start);
				s.setInt(2,count);
				ResultSet rs = s.executeQuery();
				while(rs.next())
				{
					Hero hero = new Hero();
	                int id = rs.getInt(1);
	                String name = rs.getString(2);
	                int hp = rs.getInt(3);
	                int damage = rs.getInt(4);
	                hero.id = id;
	                hero.name = name;
	                hero.hp = hp;
	                hero.damage = damage;
	                heros.add(hero);
					
				}		
			}
				catch(Exception e)
			{
				e.printStackTrace();
			}
			return heros;
		}
		
		public Hero get(int id)
		{
			Hero hero = new Hero();
			String sql = "select * from myhero where id ="+id;
	
			try(Connection conn = getConnection();PreparedStatement s = conn.prepareStatement(sql))
			{
				 ResultSet re = s.executeQuery();
				while(re.next())
				{
					if(id == re.getInt(1))
					{
	
						//System.out.println(re.getInt(3));
						hero.setId(id);
						hero.setName(re.getString(2));
						hero.setHp(re.getInt(3));
						hero.setDamage(re.getInt(4));	
					}

				}	
				
				
				return hero;
					}
				
			 catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return null;
		}

			
			
}
			
			
