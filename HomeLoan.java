package com.Loan;

import java.util.Scanner;

public class HomeLoan extends LLoan{
	void getHomeDocumentInfo() {
		System.out.println("All Personal Loan document Verified");
	}
	public static void main(String[] args) {
		System.out.println("WELCOME To VCUBE PERSONAL LOAN DEPARTMENT");
		PersonalLoan p=new PersonalLoan();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter PAN Number");
		String pan=sc.next();
		System.out.println("enter phone Number");
		String phone=sc.next();
		System.out.println("enter Adhar Number");
		String adhar=sc.next();
			double sal=p.getCustomerSalary();
			int cibil=p.getCibilScore();
			double age=p.getCustomerAge();
			if (sal>=1000000 && (cibil>=300&&cibil<=900)&&p.isValidAdhar(adhar)&& age>=24 &&p.isValidPAN(pan)&&p.isValidPhone(phone)){
				System.out.println("Congratulation !!! ");
				System.out.println("You are eligible for PersonalLoan");
				System.out.println("Your Loan Is : "+p.roInfo());
				System.out.println("Enter Address Details");
				String address=p.getAddressInfo();
				System.out.println(address);
				p.getPersonalDocumentInfo();
				
			}
			else {
				System.out.println("Your are Not eleigible for Personal Loan");
			}
		

	}

}
