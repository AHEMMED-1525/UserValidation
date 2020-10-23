package com.bridgelabz.uservalidations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class UserRegistration {
	
	static final String FirstName = "^[A-Z]{1}[a-z]{2,}";
	Scanner input=new Scanner(System.in);
	
	//Method for First name validation	
	public void firstName(){
		System.out.println("Enter your First name : ");
		String fname =input.next();
		Pattern pattern = Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(fname);
		System.out.println("First name : " + fname +" "+ matcher.matches());
	}

}
