package w1l1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your weight: ");
		float weight = sc.nextFloat();
		System.out.println("Please choice which planet are you in: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			weight *= 0.78;
			System.out.println("You are in Venus");
			break;
		case 2:
			weight *= 0.39;
			System.out.println("You are in Mars");
			break;
		case 3:
			weight *= 2.65;
			System.out.println("You are in Jupiter");
			break;
		case 4:
			weight *= 1.17;
			System.out.println("You are in Saturn");
			break;
		case 5:
			weight *= 1.05;
			System.out.println("You are in Uranus");
			break;
		case 6:
			weight *= 1.23;
			System.out.println("You are in Neptune");
			break;
		default:
			break;
		}
		System.out.println("your weight is: " + weight + " lb");
	}

}
