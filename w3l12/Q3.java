package w3l12;

/**
 * 
 * @author 984881
 *
 * result
 * 
 Exception in thread "main" java.lang.UnsupportedOperationException: Your balance in accout less than 100
	at w3l12.CustomerAccount.Withdraw(Q3.java:24)
	at w3l12.Q3.main(Q3.java:39)
 */

class CustomerAccount
{
	private String Cus_name;
	private String Acc_No;
	private double Balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
	}
	public void deposit(double money)
	{
		Balance += money;
	}
	public void Withdraw(double money)
	{
		if(Balance<money)
			throw new UnsupportedOperationException("No money, Sorry");
		else if(Balance-money<100)
			throw new UnsupportedOperationException("Your balance in accout less than 100");
		Balance -= money;
	}
	public double getBalance()
	{
		return Balance;
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAccount nc = new CustomerAccount("Tom","11",101);
		//nc.Withdraw(110);
		nc.Withdraw(2);
	}

}
