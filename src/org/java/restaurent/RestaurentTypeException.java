package org.java.restaurent;

public class RestaurentTypeException extends Exception
{
	public RestaurentTypeException()
	{
		System.err.println("Please Enter the Alphabates only  [A-Za-z] Re-Enter\n");
	}

	public RestaurentTypeException(Integer i)
	{
		System.err.println("Please Enter 10 Numbers Only [0-9] Re-Enter\n");
	}

	public RestaurentTypeException(String s)
	{
		System.err.println("Password Should Contain 1-UpperCase,4-Lowercase,2-numbers,1-@(special)\nRe-Enter");
	}

	public RestaurentTypeException(Integer i,String s)
	{
		System.err.println("ConformPassword is Not Matching With Password Re-Enter\n");
	}

	public RestaurentTypeException(char c)
	{
		System.err.println("UserNAme Or Password May Inncorrect Re-Enter\n");
	}
	
	public RestaurentTypeException(String s,int i)
	{
		System.err.println("Payment Is Invalid Please Try Again");
	}

	public RestaurentTypeException(char c, char d) 
	{
		System.out.println("Please Enter only Numbers Characters are Not Allowed..");
	}
}
