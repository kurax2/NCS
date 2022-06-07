package bankmvc;

import java.util.Scanner;

// view layer 
public class MyMVCApp {

	Scanner sc = new Scanner(System.in);
	Scanner stringScanner = new Scanner(System.in);
	
	BankOperation bankOps = new BankOperation();
	
	public static void main(String[] args) {
		MyMVCApp app = new MyMVCApp();
		
	
		while(true)
		{
			System.out.println("\n\n -------------------------------------\n");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. View Balance");
			System.out.println("4. View All Accounts ");
			System.out.println("5. Add ID of Client");
			System.out.println("6. Add Phone number ");
			System.out.println("7. Widrwal Amount");
			System.out.println("8. Account Details");
			System.out.println("9. Account Based on Balance Range");
			
			System.out.println("0. Exit");
			
			System.out.println("Enter User Choice :- ");
			int choice = app.sc.nextInt(); // static object can access through object only
			
			switch (choice) {
				case 1:
					
					app.userCreateAccountForm();
					break;
				case 2: 
					app.doDeposit();
					break;
				case 3:
					app.displayBalance();
					break;
				case 0:
					System.exit(0);
					break;
				case 4:
					app.displayAllAccounts();

			default:
				break;
			}
			
		}
		
	}
	
	
	public void displayAllAccounts()
	{
		Account arr[] = bankOps.getAllAccount();
		int count = bankOps.getCount();
		
		for(int i = 0;i<count;i++)
		{
			System.out.println(arr[i].showAccountDetails());
		}
		
	}
	
	public void displayBalance()
	{
		System.out.println("Enter the Account Number Where to Deposit Amount ");
		int accNumber = sc.nextInt();
			
		int accountBalance = bankOps.getAccountBalance(accNumber);
		
		if(accountBalance != 0)
		{
			System.out.println(" Balance :- "+accountBalance);
		}
		else
		{
			System.out.println("Enter Valid Account Number ... ");
		}
	}
	
	public void doDeposit()
	{
		System.out.println("Enter the Account Number Where to Deposit Amount ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the amount to add ");
		int amount = sc.nextInt();
		
		String response = bankOps.doDeposit(accNumber, amount);
		System.out.println(response);
	}
	
	public void userCreateAccountForm()
	{
		System.out.println("Enter the Account Holder Name ");
		String name = stringScanner.nextLine();
		
		System.out.println("Enter the Account Number ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the Account Initial Balance ");
		int balance = sc.nextInt();
		
		Account a = new Account();// client layer
		a.setAccountNumber(accNumber);
		a.setBalance(balance);
		a.setName(name);
		
		Account savedObject = bankOps.createAccount(a);
		if(savedObject == null)
		{
			System.out.println("Contact to Customer Care ...");
		}
		else
		{
			System.out.println("Account Created ");
		}
		
		
	}
}
