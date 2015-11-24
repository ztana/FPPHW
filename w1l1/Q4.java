package w1l1;
import java.util.*;
/**
 * 
 * @author 984881
 * username implement
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your first name");
		char firstChar = sc.nextLine().charAt(0);
		System.out.println("Please input your last name");
		String lastName = sc.nextLine().substring(0, 5);
		Random r = new Random();
		
		String threeDigit = String.valueOf(r.nextInt(999));
		while(threeDigit.length()<3)
		{
			String tmp ="0";
			threeDigit = tmp.concat(threeDigit);
		}
		System.out.println("Your userAccount is : " 
				+ firstChar + lastName + threeDigit);
	}

}
