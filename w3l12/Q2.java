package w3l12;

/**
 * 
 * @author 984881
 * 
 * result
 * 
Input a integer:
-9
Exception in thread "main" java.lang.AssertionError: Input>100 or Input<0
	at w3l12.Q2.main(Q2.java:17)
	
Input a integer:
abcdsd
Exception in thread "main" java.lang.AssertionError: Input>100 or Input<0
	at w3l12.Q2.main(Q2.java:29)
Input Not a number

 */

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("Input a integer:");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			n = Integer.parseInt(sc.next());
		} catch (NumberFormatException e) {
			System.out.println("Input Not a number");
		}
		
		assert(n<100 && n>0):"Input>100 or Input<0";
	}


}
