package com.bridgelabz.uservalidations;

 public class UserRegistration {
		public static void main(String[] args)
		{
			UserValidation uservalidation = new UserValidation();
			 // first name validation
				uservalidation.firstName();
			 // last name validation
				uservalidation.lastName();		
			// Email validation
				uservalidation.email();
			// Mobile validation
				uservalidation.mobile();
			// Password validation
				uservalidation.password();
			// password with One upper case
				uservalidation.passwordOneUppercase();
			// password validation for one numeric
				uservalidation.passwordOneNumeric();
			// password validation for one Special Character
				uservalidation.passwordOneSpecialChar();
		}
}
