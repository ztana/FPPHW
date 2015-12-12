package w3l12;

/**
 * 
 * @author 984881
 * result
 * 
2
divied by 0: index- 1
4
8
divied by 0: index- 4
16
Index out-of-bounds!
Index out-of-bounds!
Index out-of-bounds!

 */
public class Q1 {

	static final int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
	static final int denom[] = { 2, 0, 4, 4, 0, 8 };
	
	static int cur;
	
	Q1()
	{
		cur = 0;
	}
	

	static void detail()
	{
		
		try {
			
			if(denom[cur] == 0)
			{
				throw new ArithmeticException();
			}
			if(cur>=denom.length)
			{
				throw new ArrayIndexOutOfBoundsException("denom index out of bound");
			}
			
			System.out.println(numer[cur]/denom[cur]);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out-of-bounds!");
		} catch (ArithmeticException exc) {
			System.out.println("divied by 0: index- "+cur);
		}finally {
			cur++;
			if(cur<=numer.length)
				detail();
		}
	}
	
	public static void main(String[] args) {
		detail();
	}

}
