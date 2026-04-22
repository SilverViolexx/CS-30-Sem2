package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAccount {
	
	public static void main (String[] args) {
		String acctID;
		int actionAcc, transaction;
		double withdraw, deposit;
		boolean exist = false;
		Account obj;
		
		ArrayList<Account> accList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Create New Account" + "\n"
						+ "2. Withdraw/Deposit"  + "\n"
						+ "3. View Account Details"  + "\n"
						+ "4. Pay Monthly Fees" + "\n"
						+ "5. Exit"  + "\n" 
						+ "------------------------------------------" + "\n"
						+ "Input Choice(1-5): ");
		actionAcc = input.nextInt();
		input.nextLine();
		
		do {
			
			if (actionAcc == 1) {
				obj = bank();
				if (obj != null) {
					for (int i = 0; i < accList.size(); i++) {
						if (obj.equals(accList.get(i))) {
							exist = true;
							System.out.print("Account Already Exists." + "\n");
						}
					}
				}
				if(!exist) {
					if (obj.acctType().equalsIgnoreCase("personal")) {
						PersonalAcct newObj = (PersonalAcct) obj;
						System.out.print("\n" + "Personal Account Created!" + "\n"
							+ "Minimum Of $100 Required In Account Or $2 Monthly Fee Will Apply." +"\n");
					}
					else if (obj.acctType().equalsIgnoreCase("business")) {
						System.out.print("Business Account Created!" + "\n"
							+ "Minimum Of $500 Required In Account Or $10 Monthly Fee Will Apply." +"\n");
					}	
					accList.add(obj);
					System.out.print("ACCID: " + obj.getID() + "\n");
				}
						
					
				
			}
			else if (actionAcc == 2) {
				/*
				if (accList.isEmpty()) {
					System.out.print("No Accounts Exist. Please Create An Account First.");
					continue;
				} */
				
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
							System.out.println("New Balance: " + account.getBalance());
						}
						else if(transaction == 2) {
							System.out.print("Enter Deposit Amount($): ");
							deposit = input.nextDouble();
							input.nextLine();
							account.deposit(deposit);
							System.out.print("New Balance($): " + account.getBalance() + "\n");
						}			
						else {
							System.out.print("---- INVALID OPTION ----" + "\n");
						}
					}
					else {
						System.out.print("Account Not Found" + "\n");
					}
				}
			}
			
			else if (actionAcc == 3) {
				System.out.print("ACCID: ");
				acctID = input.nextLine();
				
				for (int i = 0; i < accList.size(); i++) {
					Account account = accList.get(i);
					if (acctID.equals(account.getID())) {
						System.out.print(account.toStringBA());
					}
				}
			}
			
			else {
				System.out.print("---- INVALID OPTION ----" + "\n");
			}
			
			System.out.print("\n" + "Input Choice(1-4): ");
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
		type = input.nextLine();
		
		if (type.equalsIgnoreCase("p")) {
			return (new PersonalAcct(balance, fName, lName, street, city, province, postalCode));
		}
		else if (type.equalsIgnoreCase("b")) {
			return (new BusinessAcct(balance, fName, lName, street, city, province, postalCode));
		}
		return null;
	}

}

