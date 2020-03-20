package com.test.herotest;


import com.test.Herodao.Herodao;
import com.test.Herodao.Userdao;
import com.test.hero.Hero;
import com.test.hero.User;

public  class JDBCtest  {
	
	public static void main(String args [])
	{
	//Hero a = new Hero(1,"盖伦",100,50);
	//Herodao hero = new Herodao();
	//hero.addhero(a);
	//hero.delect(1);
	
		
			//List<Hero> heros = new Herodao().list();
			//System.out.print(heros.get(0));
			/*StringBuffer sb = new StringBuffer();
			List <Hero> heros = new Herodao().list();
			String trFormat = "<tr><td>%d</td><td>%s</td><td>%d</td><td>%d</td></tr>\r\n";
			 for (Hero hero : heros) {
		           String tr = String.format(trFormat, hero.getId(), hero.getName(), hero.getHp(), hero.getDamage());
		           //System.out.print(tr);
		           sb.append(tr);
		        }
			 	response.getWriter().print(sb);*/
			 	
			 	//Hero a = null;
			 			//int id =3;
			 	//Herodao hero = new Herodao();
			 	//a = hero.get(id);
			 	//System.out.println(a);

			 	 User user = new Userdao().getUser("张三","123");
			 	 	System.out.print(user.password);
			 			
			
			
	}
	
	
}
