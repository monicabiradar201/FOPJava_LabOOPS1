package com.greatlearningitsupport.services;

import java.util.Random;

import com.greatlearning.itsupport.model.Employee;

public class CredentialService {
public char[] generatePassword() {
	String CaptialLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetter="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacter="!@#$%^&*()_+=-";
		String values= CaptialLetter+SmallLetter+numbers+specialCharacter;
		// using random number
		
		Random random=new Random();
		char[] password= new char[8];
		
		for(int i=0;i<8;i++) {
			//use charAt() method to get character value
			//use nextInt() as it is scanning value as int
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		
	return password;
}
public String generateEmailAddress(String fristName,String lastName,String departmet)
{
	String firstName="Monica";
	int department=0;
	return firstName+lastName+"@"+department+"abc.com";
			}
public void showCRedentials(Employee employee,String email,char[] generatePassword) {
	System.out.println("Dear"+employee.getFirstName()+"you generate credential as follows");
	System.out.println("EMail--->" +email);
	System.out.println("Password--->"+"" );
	System.out.println(generatePassword);
	
}

		
		
}

