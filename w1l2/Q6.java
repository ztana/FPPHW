package w1l1;

import java.util.Scanner;
/**
 * 
 * @author 984881
 * result
Please input checkerboard pattern: 
8
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *

 */
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input checkerboard pattern: ");
		int pattern = sc.nextInt();
		for(int i=0; i<pattern; i++)
		{
			if(i % 2 == 0)
			{
				for(int j=0; j<pattern; j++)
					System.out.print("* ");
				System.out.println();
			}
			else
			{
				for(int j=0; j<pattern; j++)
					System.out.print(" *");
				System.out.println();
			}
		}
	}

}
