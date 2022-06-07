package bankmvc;


public class SavingAccount extends Account{

	@Override
	public int fundTransfer(int amount) {
		
		int actualBalance = super.getBalance();
		if(actualBalance < 2500)
		{
			return 0;
		}
		else if((actualBalance - amount)<2500)
		{
			return 0;
		}
		else
		{
			super.setBalance(actualBalance-amount);
			return amount;
			
		}
	}

	public void provideCashBack()
	{
		System.out.println(super.getAccountType()+" CashBack() called ");
	}
	
}
