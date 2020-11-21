package main;

import java.util.Scanner;

public class BankingAplication {
	public static void main(String[] args) {
		
		//showMenuMain();
		
		BankAccount bAnew = new BankAccount("Stoyan","BA0001");
		bAnew.showMenuMain();
	}

}
class BankAccount{
	
	int balance;
	int PreviosTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid){
		
		customerName = cname;
		customerId = cid;
		
		
	}
	
	void deposit(int amount)
	{
		if(amount !=0)
		{balance = balance + amount;
		PreviosTransaction =amount;
		}
	}
	
	void withdraw(int amount) 
	{
	 if(amount !=0)
	 {
		 balance = balance - amount;
		 PreviosTransaction = -amount;
	 }
	}	
	
	void getPreviosTransactions()
	{
		if(PreviosTransaction > 0)
		{
			System.out.println("Deposited"+PreviosTransaction);
		}
		else if( PreviosTransaction < 0)
		{
			System.out.println("Withdrawn: " + Math.abs(PreviosTransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	
	 void createCustomer(){
		 
		 System.out.println("Please enter....................");
		 System.out.println("Full Name.......................");
		 System.out.println("Addres..........................");
		 System.out.println("SSN.............................");
	 };
	 
	 void createAdmin() {
		 
		 System.out.println("Please enter....................");
		 System.out.println("Full Name.......................");
		 System.out.println("ID..............................");
		 System.out.println("SSN.............................");
	 };
	 
	 
	 void  moneyTransfer() {
		 
		 System.out.println("Please enter....................");
		 System.out.println("Amount..........................");
		 System.out.println("Acount number...................");
	 };
	
	
	// no user logged in
	void showMenuMain()
	{
		char option='\0';
		Scanner scanner =new Scanner(System.in);
		System.out.println("Options:");
		System.out.println("A to log into an account");
		System.out.println("B to create a customer account");
		System.out.println("C to create an admin account");
		System.out.println("D to exit system");
		//System.out.println("Enter option: ");
		//int option = sc.nextInt();
		//sc.nextLine();
		do
		{
		
			System.out.println("=====================================");
			System.out.println("Enter an option");
			System.out.println("=====================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

		switch (option) {
		// Login log out
		case 'A':
			//login();
			showMenuCustomer();
			break;
		// create customer account
		case 'B':
			createCustomer();
			
			break;
		// create admin account
		case 'C':
			createAdmin();
			System.out.println("create an Admin");
			break;
		// exit system
		case 'D':
			System.out.println("*************************************");
			break;
			default:
				System.out.println("Invalid Option! !. Please enter again");
			break;	
		}
	}while(option !='D');
		System.out.println("ThankYou for using our services");
   }
	
	
	void showMenuCustomer()
	{
		
		char option='\0';
		Scanner scanner =new Scanner(System.in);
		System.out.println("Welcome"+ customerName);
		System.out.println("Your ID is" + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previos transaction");
		System.out.println("F. Request Funds transver");
		System.out.println("X. Exit");
		
		do
		{
			System.out.println("=====================================");
			System.out.println("Enter an option");
			System.out.println("=====================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			

		switch(option)
		{
		case 'A':
			System.out.println("-------------------------------------");
			System.out.println("Balance = "+ balance);
			System.out.println("-------------------------------------");
			System.out.println("\n");
			break;
			
		case 'B':	
			System.out.println("-------------------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("-------------------------------------");
			int amount =scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':	
			System.out.println("-------------------------------------");
			System.out.println("Enter an amount to withdraw:");
			System.out.println("-------------------------------------");
			int amount2 =scanner.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
			
		case 'D':	
			System.out.println("-------------------------------------");
			getPreviosTransactions();
			System.out.println("-------------------------------------");
			System.out.println("\n");
			break;
			
		case 'E':	
			System.out.println("-------------------------------------");
			   moneyTransfer();
			System.out.println("-------------------------------------");
			System.out.println("\n");
			break;
			
		case 'X':	
			System.out.println("*************************************");
			break;
			default:
				System.out.println("Invalid Option! !. Please enter again");
			break;	
		}
	}while(option !='X');
		System.out.println("ThankYou for using our services");
   }
}
