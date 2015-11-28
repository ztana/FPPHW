package w1h4;

/**
 * 
 * @author 984881
 * result
 * 
 true

 */

class P
{
	int cIndex = 0;
	boolean result = true;
	boolean isPalindrome(String str)
	{
		if(cIndex == str.length()-1)
		{
			return result && isPalindrome(str);
		}
		else
		{
			cIndex++;
			if(str.charAt(cIndex) == str.charAt(str.length()-cIndex-1))
				return result && true;
			else
				return result && false;
			
			
		}
	}
	
}

public class Q5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new P();
		System.out.println(p.isPalindrome("accbcca"));
	}

}

