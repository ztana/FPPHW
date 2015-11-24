package w1l1;

import java.util.Scanner;
/**
 * 
 * @author 984881
 *	decrypting
 * swap the first digit with the third,
 * and swap the second digit with the fourth.
 * Replace each digit 
 * 0-3
 * 1-4
 * 2-5
 * 3-6
 * 4-7
 * 5-8
 * 6-9
 * 7-0
 * 8-1
 * 9-2
 * so 7~9 by lessing  7
 * 	  0~8 by adding   3
 * 
 * and getting the remainder after dividing the new value by 10.
 * 
 * 
 * result:
Please input your 4-digit integer: 
0189
1234
 * 
 */
public class Q9_decrypting {

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
		int digits[] = new int[4];
		digits[0] = (input/1000)		%10;
		digits[1] = ((input%1000 /100))	%10;
		digits[2] = ((input%100 /10)) 	%10;
		digits[3] = (input%10)			%10;
		for(int i=0;i<4;i++)
			digits[i] = (digits[i]>=7? digits[i]-7 : digits[i]+3);
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
