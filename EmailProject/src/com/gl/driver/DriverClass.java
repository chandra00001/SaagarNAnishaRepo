package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Suman","Raghavan");
		
		CredentialService cService = new CredentialService();
		String generatedEMail;
		char[] generatedPsswd = new char[8];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Credential System");
		System.out.println("1.Technical Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal Department");
		
		int choice;
		System.out.println("Enter Your Choice");
		choice = scan.nextInt();
		if( choice == 1)
		{
			generatedEMail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(), "Tech");
			generatedPsswd = cService.generatePassword();
			System.out.println(generatedPsswd);
			cService.displayCredentials(employee, generatedEMail, generatedPsswd);
		}
		else if (choice == 2)
		{
			generatedEMail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(), "Admin");
			generatedPsswd = cService.generatePassword();
			System.out.println(generatedPsswd);
			cService.displayCredentials(employee, generatedEMail, generatedPsswd);
		}
		else if(choice == 3)
		{
			generatedEMail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(), "Human");
			generatedPsswd = cService.generatePassword();
			System.out.println(generatedPsswd);
			cService.displayCredentials(employee, generatedEMail, generatedPsswd);
		}
		else if(choice == 4)
		{
			generatedEMail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(), "Legal");
			generatedPsswd = cService.generatePassword();
			System.out.println(generatedPsswd);
			cService.displayCredentials(employee, generatedEMail, generatedPsswd);
		}
		else
		{
			System.out.println("Sorry Right Choice is 1-4");
		}
		
		

	}

}
