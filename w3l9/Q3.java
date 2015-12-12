package w3l9;

/**
 * 
 * @author 984881
 * result
 * 
 * This is palindramoe

 */

class Stack
{
	char data[];
	int top;
	Stack()
	{
		data = new char[30];
		top = 0;
	}
	void add(char d)
	{
		data[top++] = d;
	}
	void remove()
	{
		top--;
	}
	char peek()
	{
		return data[top-1];
	}
	boolean isOK()
	{
		return (top==0||top==1)?true:false;
	}
}



public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tes121set";
		//is s.length is a prime number ignore the letter in the middle.
		boolean isPrimeCount = (s.length()/2==0)?false:true;
		Stack t = new Stack();
		t.add(s.charAt(0));
		for(int i=1;i<s.length();)
		{
			char tm = t.peek();
			
			if(isPrimeCount && i==s.length()/2)
			{
				i++;
			}
			else
			{
				if(s.charAt(i) == t.peek())
				{
					t.remove();
				}
				else
				{
					t.add(s.charAt(i));
				}
				i++;
			}
		}
		System.out.println(t.isOK()?"This is palindramoe":"This is not palindrome");
	}

}
