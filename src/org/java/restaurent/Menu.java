package org.java.restaurent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu 
{
	static Integer choice,quantity=1;
	static String again,option;
	static Integer total=0,pay;
	static int temp;
	Map<Integer, String> veg = new HashMap<>();
	Map<Integer, String> nonVeg = new HashMap<>();

	Scanner scanner = new Scanner(System.in);

	public void displayMenu()
	{

		System.out.println("\t\t\t\t\t   MENU");
		System.out.println("\t\t  +===================================================+");
		System.out.println("\t\t\t          Please Select Veg/NonVeg\n");
		System.out.println("\t\t\t\t\t1.VegItems\n");
		System.out.println("\t\t\t\t\t2.NonVegItems\n");
		System.out.println("\t\t  +===================================================+");

		System.out.println("\t Choose The Option ");
		try{
			option = scanner.next();
			if(!Pattern.matches("[a-zA-z]*", option))
			{
				switch (option) 
				{
				case "1":
					System.out.println("You Choose's  VegItems\n");
					vegItems();
					break;
				case "2":
					System.out.println("You Choose's  NonVegItems\n");
					nonVegItems();
					break;
				default:
					System.err.println("enter the number between 1 to 2 only");
					displayMenu();
					break;
				}
			}
			else
			{
				throw new RestaurentTypeException('a','b');
			}
		}
		catch(RestaurentTypeException e)
		{
			System.out.println("Re-Enter..");
			displayMenu();
		}
	}
		public void vegItems()
		{
			for (Map.Entry it : veg.entrySet()) 
			{
				System.out.println("\t\t"+it.getKey()+" "+it.getValue());
			}
			System.out.println("\nPlease Select Your Item: ");

			choice=scanner.nextInt();
			if (choice==1)
			{
				System.out.println("You Choose VegBiryani");
				System.out.print("How many VegBiryan's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*100);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();
				}
			}
			else if(choice==2)
			{
				System.out.println("You Choose TomatoRice");
				System.out.print("How many TomatoRice's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*80);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();

				}
			}
			else if (choice==3) 
			{
				System.out.println("You Choose PannerBiryani");
				System.out.print("How many PannerBiryani's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*140);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();

				}
			}else
			{
				System.err.println("Please Choose Correct Option in (1,2,3)");
				vegItems();
			}
		}

		public void nonVegItems()
		{
			for (Map.Entry it : nonVeg.entrySet()) 
			{
				System.out.println("\t\t"+it.getKey()+" "+it.getValue());
			}
			System.out.println("Please Select Your Item: ");

			choice=scanner.nextInt();
			if (choice==1)
			{
				System.out.println("You Choose ChickenBiryani");
				System.out.print("How many ChickenBiryan's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*120);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else {
					payment();
				}
			}
			else if(choice==2)
			{
				System.out.println("You Choose MuttonBiryani");
				System.out.print("How many MuttonBiryani's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*130);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();
				}
			}
			else if (choice==3) 
			{
				System.out.println("You Choose Rotti");
				System.out.print("How many Rotti's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*20);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();
				}
			}
			else if (choice==4) 
			{
				System.out.println("You Choose ChickenCurry");
				System.out.print("How many ChickenCurry's you Want to Buy :");
				quantity=scanner.nextInt();
				total=total+(quantity*60);
				temp=total;
				System.out.println("You Want To Buy Again ?");
				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if (again.equalsIgnoreCase("Y")) 
				{
					vegItems();
				} else 
				{
					payment();
				}
			}
			else
			{
				System.err.println("Please Choose Correct Option in (1,2,3,4)");
				nonVegItems();
			}
		}

		public void payment() 
		{
			try{
				System.out.println("Total Price is: " + total);
				System.out.println("Enter Payment to Pay: ");
				pay = scanner.nextInt();
				//total = total - pay;
				if (pay.equals(total)) {
					System.out.println("Sucessfully Bill Paid " + temp);
					System.out.println("Oeder is Conformed");
					System.out.println("\t\t\t\t====Thanku You====");
				}else if(pay>total)
				{
					System.out.println("Sucessfully Bill Paid " + pay);
					System.out.println("Oeder is Conformed");
					total=pay-total;
					System.out.println("Your Change is Rs: "+total);
					System.out.println("\t\t\t\t====Thanku You====");
				}
				else {
					throw new RestaurentTypeException("d",1);

				}
			}catch(RestaurentTypeException e)
			{
				payment();
			}
		}
}
