package com.greatlearningitsupport.services;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Employee employee=new Employee ("Monica", "Anand");
		CredentialService cs=new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Please enter the department from the folowing");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
	Scanner sc= new Scanner(System.in);
	int option=sc.nextInt();


	if (option==1) {
		if (option==1) {
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCRedentials(employee,generatedEmail,generatedPassword);
			}
		
		
		}
	
	else if (option==2) { 
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"Admin");
		generatedPassword=cs.generatePassword();
		cs.showCRedentials(employee,generatedEmail,generatedPassword);
		
		}
	else if (option==3) {
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"hr");
		generatedPassword=cs.generatePassword();
		cs.showCRedentials(employee,generatedEmail,generatedPassword);
		}
	else if (option==4) {
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"legal");
		generatedPassword=cs.generatePassword();
		cs.showCRedentials(employee,generatedEmail,generatedPassword);
		}
	else 
		System.out.println("Enter a valid option");
	sc.close();
	
	
	
	}

	
	}


