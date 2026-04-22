package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAccount {
	
	public static void main (String[] args) {
		String acctID;
		int actionAcc, transaction;
		double withdraw, deposit;
		ArrayList<Account> accList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Create New Account" + "\n"
						+ "2. Withdraw/Deposit"  + "\n"
						+ "3. View Account Details"  + "\n"
						+ "4. Pay Monthly Fees" + "\n"
						+ "5. Exit"  + "\n" 
						+ "------------------------------------------" + "\n"
						+ "Input Choice(1-4): ");
		actionAcc = input.nextInt();
		
		do {
			
			if (actionAcc == 1) {
				Account obj = bank();
				
				for (int i = 0; i < accList.size(); i++) {
					if (obj.equals(accList.get(i))) {
						System.out.print("Account Already Exists.");
					}
					else {
						
						accList.add(obj);
						System.out.print("ACCID: " + obj.getID() + "hello");
					}
				}	
			}
			else if (actionAcc == 2) {
				System.out.print("ACCID: ");
				acctID = input.nextLine();
				
				for (int i = 0; i < accList.size(); i++) {
					Account account = accList.get(i);
					if (acctID.equalsIgnoreCase(account.getID())) {
						System.out.print("1. Withdraw" + "\n"
								+ "2. Deposit" +"\n"
								+ "Input Choice(1-2): ");
						transaction = input.nextInt();
						input.nextLine();
						
						if(transaction == 1) {
							System.out.print("Enter Withdrawal Amount($): ");
							withdraw = input.nextDouble();
							input.nextLine();
							account.withdrawal(withdraw);
							System.out.print("New Balance: " + account.getBalance());
						}
						else if(transaction == 2) {
							System.out.print("Enter Deposit Amount($): ");
							deposit = input.nextDouble();
							input.nextLine();
							account.withdrawal(deposit);
							System.out.print("New Balance: " + account.getBalance());
						}						
					}
				}
			}
			/*
			else if (actionAcc == 3) {
				System.out.print("ACCID: ");
				acctID = input.nextLine();
				
				for (int i = 0; i < accList.size(); i++) {
					
				}
			}
			*/
			
			System.out.print("Input Choice(1-4): ");
			actionAcc = input.nextInt();
			input.nextLine();
			
		} while (actionAcc != 5);
		
		
	
	}
	
	
	public static Account bank() {
		String fName, lName, acctID, street, city, province, postalCode, type;
		double balance;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n" + "First Name: ");
		fName = input.nextLine();
		
		System.out.print("Last Name: ");
		lName = input.nextLine();
		
		System.out.print("Initial Balance: ");
		balance = input.nextDouble();
		input.nextLine();	
		
		System.out.print("\n" + "Enter Address Information" + "\n"
						+ "Street: ");
		street = input.nextLine();
		
		System.out.print("City: ");
		city = input.nextLine();
		
		System.out.print("Province: ");
		province = input.nextLine();
		
		System.out.print("Postal Code: ");
		postalCode = input.nextLine();
		
		System.out.print("(B)usiness OR (P)ersonal Account: ");
		type = input.next();
		
		if (type.equalsIgnoreCase("p")) {
			System.out.print("\n" + "Personal Account Created!" + "\n"
					+ "Minimum Of $100 Required In Account Or $2 Monthly Fee Will Apply." +"\n");
			return (new PersonalAcct(balance, fName, lName, street, city, province, postalCode));
		}
		else if (type.equalsIgnoreCase("b")) {
			System.out.print("Business Account Created!" + "\n"
					+ "Minimum Of $500 Required In Account Or $10 Monthly Fee Will Apply." +"\n");
			return (new BusinessAcct(balance, fName, lName, street, city, province, postalCode));
		}
		return null;
	}

}

