package w1l3;
/**
 * 
 * @author 984881
 * result
 * 
Saver1's current saving balance for month 1 is: 2006.67
Saver2's current saving balance for month 1 is: 3010.00
Saver1's current saving balance for month 2 is: 2013.36
Saver2's current saving balance for month 2 is: 3020.03
Saver1's current saving balance for month 3 is: 2020.07
Saver2's current saving balance for month 3 is: 3030.10
Saver1's current saving balance for month 4 is: 2026.80
Saver2's current saving balance for month 4 is: 3040.20
Saver1's current saving balance for month 5 is: 2033.56
Saver2's current saving balance for month 5 is: 3050.33
Saver1's current saving balance for month 6 is: 2040.33
Saver2's current saving balance for month 6 is: 3060.50
Saver1's current saving balance for month 7 is: 2047.14
Saver2's current saving balance for month 7 is: 3070.70
Saver1's current saving balance for month 8 is: 2053.96
Saver2's current saving balance for month 8 is: 3080.94
Saver1's current saving balance for month 9 is: 2060.81
Saver2's current saving balance for month 9 is: 3091.21
Saver1's current saving balance for month 10 is: 2067.68
Saver2's current saving balance for month 10 is: 3101.51
Saver1's current saving balance for month 11 is: 2074.57
Saver2's current saving balance for month 11 is: 3111.85
Saver1's current saving balance for month 12 is: 2081.48
Saver2's current saving balance for month 12 is: 3122.22
Saver1's current saving balance is: 2090.16
Saver2's current saving balance is: 3135.23
 */
public class SavingsAccount {
	
	private static double annualInterestRate;
	private double savingsBalance;
	
	public void calculateMonthlyInterest()
	{
		savingsBalance += this.savingsBalance * annualInterestRate / 12 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		SavingsAccount.setAnnualInterestRate(0.04);
		for(int m=0;m<12;m++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("Saver1's current saving balance for month %d is: %.2f\n",m+1,saver1.getSavingsBalance());
			System.out.printf("Saver2's current saving balance for month %d is: %.2f\n",m+1,saver2.getSavingsBalance());
		}

		SavingsAccount.setAnnualInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver1's current saving balance is: %.2f\n",saver1.getSavingsBalance());
		System.out.printf("Saver2's current saving balance is: %.2f\n",saver2.getSavingsBalance());
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double d) {
		SavingsAccount.annualInterestRate = d;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}



}

