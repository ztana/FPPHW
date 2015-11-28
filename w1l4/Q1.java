package w1l4;

/**
 * 
 * @author 984881
 *
 * result
 * 
a
a
a
a
 */

public class Q1 {
	
	static String sort(String string1, String string2)
	{
		if(string1.isEmpty() || string2.isEmpty())
		{
			return string1+string2;
		}
		else
		{
			if(string1.charAt(0)>string2.charAt(0))
			{
				 return string2.charAt(0) + sort(string2.substring(1),string1);
			}
			else
			{
				return string1.charAt(0) + sort(string2,string1.substring(1));
			}
		}
		
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String string1 ="ace";
		String string2 ="bdf";

		System.out.println(sort(string1,string2));
	}

}
