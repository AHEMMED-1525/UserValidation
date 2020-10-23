package com.bridgelabz.uservalidations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserValidation 
	{
		static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}";
		static final String email_pattern = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		static final String mobile_Pattern = "^[0-9]{2}[ ][0-9]{10}+$";
		static final String password_Pattern = "^[a-z]{8,}+$";
		Scanner input = new Scanner(System.in);
		
		//Method for First name validation	
		public void firstName()
		{
			System.out.print("Enter your First name : ");
			String fname = input.nextLine();
			Pattern pattern = Pattern.compile(Name_Pattern);
			Matcher matcher = pattern.matcher(fname);
			boolean match =  matcher.matches();
			System.out.println("First name : " + fname +" is " + match);
		}
		// Method for Last Name Validation
		public void lastName()
		{
			System.out.print("Enter your Last Name : ");
			String lname = input.nextLine();
			Pattern pattern = Pattern.compile(Name_Pattern);
			Matcher matcher = pattern.matcher(lname);
			boolean match =  matcher.matches();
			System.out.println("Last name : " + lname +" is " + match);
		}
		// Method For Email validation
		public void email()
		{
			System.out.print("Enter your Email : ");
			String email =input.next();
			Pattern pattern = Pattern.compile(email_pattern);
			Matcher matcher = pattern.matcher(email);
			boolean match =  matcher.matches();
			System.out.println("Email : " + email +" is " + match);
			
		}
		//Method for Mobile number validation
		public void mobile()
		{
			System.out.println("Enter your Mobile number : ");
			String mobile = input.next();
			Pattern pattern = Pattern.compile(mobile_Pattern);
			Matcher matcher = pattern.matcher(mobile);
			boolean match =  matcher.matches();
			System.out.println("Mobile number : " + mobile +" is " + match);
		}
		//Method for Mobile number validation
		public void password()
		{
			System.out.print("Enter your password : ");
			String password =input.next();
			Pattern pattern = Pattern.compile(password_Pattern);
			Matcher matcher = pattern.matcher(password);
			boolean match =  matcher.matches();
			System.out.println("Password : " + password +" is " + match);
		}
	
	}
