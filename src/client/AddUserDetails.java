package client;

import java.util.ArrayList;
import model.Customer;
import java.util.Scanner;


import sevice.seviceImpi.servImpliClass;

public class AddUserDetails {
	
	private static servImpliClass service = new servImpliClass();
	static Scanner sc = new Scanner(System.in);
	public static double wdAmt;
	

	public void createCustomer() {

		service.getDB();
		
		
		// addData.createtavble();
		
		//System.out.println(cs);
	}

	public void insertDetails() {
		System.out.println("Enter the user id");
		int userId = sc.nextInt();
		System.out.println("Enter the user name");
		sc.nextLine();
		String userName = sc.next();
		System.out.println("Enter the date of birth");
		String DOB = sc.next();
		System.out.println("Enter the card number");
		int cardNumber = sc.nextInt();
		System.out.println("Enter the Pin");
		int atmPin = sc.nextInt();
		System.out.println("Enter the cash");
		double cash = sc.nextDouble();

		Customer cm=new Customer(userId,userName,DOB,cardNumber,atmPin,cash);
		
		service.insertDetailsInService(cm);
		
	}

	// to withdraw
	public void withdrawCash(Customer cm) {
		System.out.println("enter the amount you want to withdraw");
		double wdAmt=sc.nextDouble();
		
		//double wd = withdraw.withdrawAmtfromDb();

	//	System.out.println(wd);
	}

	public void depositeCash(Customer cm) {
		System.out.println("Enter the user id");
		int userId = sc.nextInt();
		System.out.println("Enter the user name");
		sc.nextLine();
		String userName = sc.next();

		System.out.println("Enter the Pin");
		int atmPin = sc.nextInt();
		System.out.println("Enter the deposite cash");
		double depCash = sc.nextDouble();
          
		Customer dep=new Customer(userId,userName,atmPin,depCash);
		
		double amt=service.deposite(dep,userId);
		double cash=cm.getCash();
		cash=amt;
		 cm=new Customer(userId,userName,cm.getDOB(),cm.getCardNumber(),atmPin,cash);
		 
//		 System.out.println(cm.getCardNumber());
//		System.out.println(cm);
//		
		
	}
}
