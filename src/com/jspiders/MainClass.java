package com.jspiders;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		AtmOperationInterf operation=new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!!");
		System.out.println("Enter ATM Number : ");
		int atmNumber=scanner.nextInt();
		System.out.println("Enter Pin : ");
		int pin=scanner.nextInt();
		
		if((atmnumber==atmNumber) && (atmpin==pin)) {
			System.out.println("Validation Done");
			
			while (true) {
				System.out.println("1. view Available Balance \n"
						+ "2. withdraw Amouny \n"
						+ "3. Deposite Amount \n"
						+ "4. viw Ministatement \n"
						+ "5. Exit");
				
				System.out.println("Enter  choice : ");
				int ch=scanner.nextInt();
				if(ch==1) {
					operation.viewBalance();
					
					
				}
				else if(ch==2) {
					System.out.println("Enter Amount  to withdraw ");
				double  withdrawAmount= scanner.nextDouble();
				operation.withdrawAmount(withdrawAmount);
				}
				
				else if(ch==3) {
					System.out.println("Enter Amount to deposite : ");
					double  depositAmount=scanner.nextDouble(); ///5000
					operation.depositAmount(depositAmount);
					
				}
				else if(ch==4) {
					operation.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect Your ATM card \n"
							+ "Thank you for using ATM Machine !!");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct choice");
				}
			}
		}
		else {
			System.out.println("Incorrect Atm Number or pin");
			System.exit(60);
		}
	}

}
