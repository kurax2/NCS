package bankmvc;

public class CurrentAccount extends Account{

	
	@Override
	public int fundTransfer(int amount) {
	
		int actualBalance = super.getBalance();
		
		super.setBalance(actualBalance-amount);
		return amount;
	
	}
	
	public void giveBusinessLoan()
	{
		System.out.println(super.getAccountType()+" call give business loan method ");
	}
	
	

}
