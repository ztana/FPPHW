package w1l1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strGot = null;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter a five-digit number:");
			strGot = sc.nextLine();			
		}while(strGot.length() != 5);
		
		
		if((strGot.charAt(0) == strGot.charAt(4)) && (strGot.charAt(1) == strGot.charAt(3)))
		{
			System.out.println("A palindrome !\n");
		}
		else
		{
			System.out.println("Not A palindrome !\n");
		}
	}

}
