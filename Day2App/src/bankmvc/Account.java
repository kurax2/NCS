package bankmvc;

/*bean class , which reusable component */
abstract public class Account {

	private int accountNumber;
	private String name ; // account holder name
	private int balance;
	private String accountType;
	
	/* not the part of Java bean class standard*/
	public Account(String name) {
		this.name = name;
	}
	
	/*must have default constructor*/
	public Account() {
		this.name = "No Name";
	}
	
	public Account(int num, String accName, int accBalance) {
		accountNumber = num;
		name = accName;
		balance = accBalance;
	}

	/* java will not 
	 * create default constructor*/
		
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accNum) {
		accountNumber = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String accHolderName) {
		name = accHolderName;
	}
	public int getBalance() {
		return balance;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(int initialBalance) {
		if(initialBalance < 2500)
		{
			System.out.println("Inital Deposit cannot be less than $2500");
		}
		else
		{
			balance = initialBalance;
		}
		
	}
	
	public String showAccountDetails()
	{
		return "Account -"+accountNumber+" , "+name+" , $"+balance+" Account Type "+accountType;
	}
	
	/* method perform fund transfer operation and return the transfered amount*/
	public abstract int fundTransfer(int amount); 
	
	
	
}//end of laptop class
