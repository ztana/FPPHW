package w1l1;


import java.util.*;

/**
 * 
 * @author 984881
 *
 * money calculator
 * result
 Enter an amount of money, for example, 11,56:

11.36
11 dollars
1 quarters
1 dimes
0 nickles
1 pennies
 */
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an amount of money, for example, 11,56:\n");
		Scanner sc = new Scanner(System.in);
		float amountGot = sc.nextFloat();
		
		int cents = (int) (amountGot*100);
		int dollars = cents /100;
		int quarters = cents %100 /25;
		cents -= quarters * 25;
		int dimes = cents%25 / 10;
		cents -= dimes*10;
		int nickles = cents%10 /5;
		cents -= nickles * 5;
		int pennies = cents%10;
		
		System.out.print(dollars	+	" dollars\n");
		System.out.print(quarters	+	" quarters\n");
		System.out.print(dimes		+	" dimes\n");
		System.out.print(nickles	+	" nickles\n");
		System.out.print(pennies	+	" pennies");

	}

}
