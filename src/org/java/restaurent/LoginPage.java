package org.java.restaurent;

import java.util.Scanner;

public class LoginPage extends Registration
{
Scanner sc=new Scanner(System.in);
	
	public void userLogin() {
		try {
			System.out.println("\nEnter your Name");
			String uName = sc.next();
			System.out.println("Enter your Password");
			String uPwd = sc.next();

			if (uName.equalsIgnoreCase(Registration.name) && uPwd.equalsIgnoreCase(Registration.password)) {
				System.out.println(uName + " WelCome to Aryan Resturent ");
				demo();

			} else {
				throw new RestaurentTypeException('a'); 
			}
		} catch (Exception e) {
			System.out.println("Re-Enter");
			userLogin();
		}
	}
	
	public void demo() 
	{
		Items items = new Items();
		items.menuu();

	}
}
