package client;

import java.util.Scanner;

import model.Customer;
import sevice.CostomerInterface;

public class ATMApplication {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		AddUserDetails add=new AddUserDetails();
		Customer cm=new Customer();
		boolean flag=true;
		int choice=0;
		do {
			displayMenu();
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:add.createCustomer();
			break;
			case 2:add.insertDetails();
			break;
			case 3:add.depositeCash(cm);
			break;
//			case 4:displayBill();
//			break;
//			case 5:flag=false;
//			System.out.println("THANK YOU");
//			break;
			default:System.out.println("Sorry..Invalid Option");
			}
		}while(flag);

	}

	private static void displayMenu() {
		System.out.println("Enter the below options");
		System.out.println("Press 1 to create customer table");
		System.out.println("Press 2 to insert the user deatils");
		System.out.println("Press 3 to deposite the cash");
		System.out.println("Press 4 to display bill");
	}

}
