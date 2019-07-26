package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "../BankApp/csv/NewBankAccounts.csv";
		
//		Checking chkacc1 = new Checking("Tom Hanks","32123556",1500);
//		Savings savacc1 = new Savings("Rich Lowe","55463311",2500);
//		
//		
//		savacc1.compound();
//		
//		savacc1.showInfo();
//		System.out.println("*************");
//		
//		chkacc1.showInfo();
		
		List<Account> accounts = new LinkedList<Account>();
		
		
		//Read a CSV File and then create new accounts based on the data. 
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			
			double initDeposit = Double.parseDouble(accountHolder[3]);
//			System.out.println(name + " " + SSN + " " + accountType + " $" + initDeposit);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			} else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
		}
		
		for(Account acc : accounts) {
			System.out.println("\n****************");
			acc.showInfo();
		}
		
		accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		accounts.get((int) Math.random() * accounts.size()).withdraw(500);
	}

}
