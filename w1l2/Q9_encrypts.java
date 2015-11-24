package w1l1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author 984881
 * encrypting
 * Replace each digit with the result of adding 7 to the digit 
 * and getting the remainder after dividing the new value by 10.
 * Then swap the first digit with the third,
 * and swap the second digit with the fourth.
 * 
 * result:
Please input your 4-digit integer: 
1234
0189
 */
public class Q9_encrypts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your 4-digit integer: ");
		int input = sc.nextInt();
		while(input > 9999 && input <1000)
		{
			System.out.println("This is not a 4-digit interger,Please input your 4-digit integer :");
			input = sc.nextInt();
		}
		//add 7 and get remainder
		int digits[] = new int[4];
		digits[0] = (input/1000 + 7)		%10;
		digits[1] = ((input%1000 /100) + 7)	%10;
		digits[2] = ((input%100 /10) +7) 	%10;
		digits[3] = (input%10 + 7)			%10;
		//swap
		int tmp = digits[0];
		digits[0] = digits[2];
		digits[2] = tmp;
		tmp = digits[1];
		digits[1] = digits[3];
		digits[3] = tmp;
		for(int o:digits)
			System.out.print(o);
	}

}
