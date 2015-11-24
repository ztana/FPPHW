package w1l1;

import java.util.Scanner;

/**
 * 
 * @author 984881
 * Leap Year
 */
public class Q2 {

	public static void main(String[] args) {
		System.out.println("Enter Year:");
		Scanner sc = new Scanner(System.in);
		int yearGot = sc.nextInt();
		
		if((yearGot % 4==0 && yearGot %100 !=0) || yearGot %400 == 0)
			System.out.println("This year is a Leap Year\n");
		else
			System.out.println("This year is not a Leap Year\n");
	}

}
