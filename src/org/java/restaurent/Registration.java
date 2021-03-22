package org.java.restaurent;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration extends Thread
{
	static String name;
	static String password;

	Scanner sc = new Scanner(System.in);
	CustomerDetails details = new CustomerDetails();

	public void name() 
	{
		try {
			System.out.println("Enter your Name");
			name = sc.next();
			if (Pattern.matches("[A-Za-z]{1,15}", name)) {
				details.setName(name);
			} else {
				throw new RestaurentTypeException();
			}
		} catch (Exception e) {
			//System.out.println("Re-Enter Your Name\n");
			name();
		}

	}

	public void phoneNumber() {
		try {
			System.out.println("Enter your phoneNumber");
			String phone = sc.next();
			if (Pattern.matches("\\d{10}", phone)) {
				details.setPhoneNumber(phone);
			} else {
				throw new RestaurentTypeException(1);
			}
		} catch (Exception e) {
			//System.out.println("Re-Enter the Number\n");
			phoneNumber();
		}

	}

	public void password() {
		try {
			System.out.println("Enter your Password");

			password = sc.next();

			if (Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{2}[@]{1}", password)) {
				details.setPassword(password);
			} else {
				throw new RestaurentTypeException("ra");
			}
		} catch (Exception e) {
			//System.out.println("Re-Enter the password\n");
			password();
		}

	}

	public void conformPassword() {
		try {
			System.out.println("Enter ConformPassword");
			String cmPwd = sc.next();
			if (Registration.password.equalsIgnoreCase(cmPwd)) {
				details.setConformPassword(cmPwd);
				System.out.println("\nRegistration Sucessfull Login-In");
				log();
				//userLogin();
			} else {
				throw new RestaurentTypeException(1,"a");
			}
		} catch (Exception e) {
			//System.out.println("Re-Enter ConFormPAssword\n");
			conformPassword();
		}
	}
	public void log()
	{
		LoginPage page = new LoginPage();
		page.userLogin();
	}
	/*public void userLogin() {
		try {
			System.out.println("\nEnter your Name");
			String uName = sc.next();
			System.out.println("Enter your Password");
			String uPwd = sc.next();
			if (uName.equalsIgnoreCase(name) && uPwd.equalsIgnoreCase(password)) {
				System.out.println(name + " WelCome to Aryan Resturent ");
			} else {
				throw new RestaurentTypeException('a'); 
			}
		} catch (Exception e) {
			System.out.println("Re-Enter");
			userLogin();
		}
	}
	public void demo() {
		Items items = new Items();
		items.menuu();
	}*/
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		name();
		phoneNumber();
		password();
		conformPassword();
		//demo();

	}
}
