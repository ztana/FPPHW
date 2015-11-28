package w1h4;

/**
 * 
 * @author 984881
 * result
 * 
 551

 */

public class Q4 {

	static int arr[] = {1,3,542,5};
	static int curIndex = 0;
	
	static int sum()
	{
		if(arr.length == curIndex)
			return 0;
		else
			return arr[curIndex++] + sum();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
	}

}
