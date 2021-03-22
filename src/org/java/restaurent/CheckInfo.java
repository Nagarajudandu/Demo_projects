package org.java.restaurent;

import java.util.ArrayList;

public class CheckInfo 
{
	public void check(String name)
	{
		ArrayList<String> name1  = new ArrayList<String>();
		ArrayList<String> pwd1  = new ArrayList<String>();
		
		name1.add("Yogesh");
		name1.add("Nagaraju");
		name1.add("Dhanunjay");
		name1.add("Sripad");
		
		pwd1.add("Yyoyo12@");
		pwd1.add("Draju12@");
		pwd1.add("Dhanu12@");
		pwd1.add("Sripa12@");
		
		for (int i = 0; i < name1.size(); i++) 
		{
			String s=name1.get(i);
			String s1=pwd1.get(i);
			
			CustomerDetails details = new CustomerDetails(s,s1);
		}
		
		
		if (name1.contains(name)) 
		{
			LoginPage loginPage=new LoginPage();
			loginPage.userLogin();
		}
		else
		{
			Registration reg = new Registration();
			reg.start();
		}
		
	}
}
