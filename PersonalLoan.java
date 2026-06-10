package com.Loan;

import java.util.Scanner;

public class PersonalLoan {
	Scanner sc=new Scanner(System.in);
	double getCustomerSalary() {
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		return salary;
	}
	double getCustomerAge() {
		System.out.println("Enter your age:");
		double age=sc.nextInt();
		return age;
	}
	int getCibilScore() {
		//700-900 is the excellent score lenders may give loan without any doubt
		System.out.println("Enter Cibil Score");
		int cibilScore=sc.nextInt();
		return cibilScore;
	}
	double roInfo() {
		double roinfo=0.0;
		int cibilScore=getCibilScore();
		if (cibilScore>=300&&cibilScore<=599) {
			System.out.println("Poor Score,High risk of Lenders,loan apllications may reject you");
			roinfo=11.0;
		}
		else if(cibilScore>=600 && cibilScore<=699) {
			System.out.println("Fair Score : Moderate risk, may get stricter loan terms");
			roinfo=10.0;
		}
		else if(cibilScore>=700&&cibilScore<=749) {
			System.out.println("Goood score better chances of gettoing the bank loan");
			roinfo=9.0;
		}
		else if(cibilScore>=700 && cibilScore<=900) {
			System.out.println("Excellent CibilScore,Very High chances og getting BAnk loans");
			roinfo=8.0;
		}
		else {
			System.out.println("Invalid CibilScore");
		}
		return roinfo;
	}
	String getAddressInfo(){
		String address="";
		System.out.println("Enter falt No");
		String flat=sc.next();
		System.out.println("Enter plot No");
		String plot=sc.next();
		System.out.println("Enter Street");
		String street=sc.next();
		System.out.println("Enter City name");
		String city=sc.next();
		System.out.println("Enter PinCode");
		long pin=sc.nextLong();
		System.out.println("Enter state");
		String state=sc.next();
		address="Flaot No : "+flat +","+" Plot No : "+plot+","+ "street : "+street+" ,"+
		" city : "+city+","+"Pin Code : "+pin+","+"state : "+state;
		return address;
	}
	void getPersonalDocumentInfo() {
		System.out.println("All Personal Loan document Verified");
	}
	public static boolean isValidPAN(String pan) {
	    return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");
	}
	public static boolean isValidAdhar(String adhar) {
	    return adhar.matches("\\d{12}");
	}
	public static boolean isValidPhone(String phone) {
	    return phone.matches("[6-9]{1}[0-9]{9}");
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
			if (sal>=1000000 && (cibil>=300&&cibil<=900)&&p.isValidAdhar(adhar)&&p.isValidPAN(pan)&&p.isValidPhone(phone)){
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
