package w1l4;

/**
 * 
 * @author 984881
 * result
 *
a
a
a
a
 */

public class Q2 {

	static char a = 'z';
	
	static char minChar(String str)
	{
		
		if(str.length() == 1)
			return str.charAt(0)<a? str.charAt(0) : a;
		else
		{
			if(str.charAt(0)<a)
				a = str.charAt(0);
			return minChar(str.substring(1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minChar("kela"));
		System.out.println(minChar("keal"));
		System.out.println(minChar("kael"));
		System.out.println(minChar("akel"));
	}

}
