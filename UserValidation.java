package com.bridgelabz.uservalidations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserValidation 
	{
		static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}";
		Scanner input = new Scanner(System.in);
		
		//Method for First name validation	
		public void firstName()
		{
			System.out.println("Enter your First name : ");
			String fname = input.nextLine();
			Pattern pattern = Pattern.compile(Name_Pattern);
			Matcher matcher = pattern.matcher(fname);
			boolean match =  matcher.matches();
			System.out.println("First name : " + fname + match);
		}
		// Method for Last Name Validation
		public void lastName() {
			System.out.println("Enter your Last Name : ");
			String lname = input.nextLine();
			Pattern pattern = Pattern.compile(Name_Pattern);
			Matcher matcher = pattern.matcher(lname);
			boolean match =  matcher.matches();
			System.out.println("Last name : " +lname +" "+match);
		}
	
	}
