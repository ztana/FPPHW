package w1l3;
/**
 * 
 * @author 984881
 * result
 * 
108.00
216.00
213.84

 */
public class Billing {

	private final float tax = 0.08f;

	public float computeBill(float price)
	{
		return price * (1+tax);
	}
	
	public float computeBill(float price, int quantity)
	{
		return price * (1+tax) * quantity;
	}
	
	public float computeBill(float price, int quantity, float coupon)
	{
		return price * (1+tax) * quantity * (1-coupon*0.01f);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billing bill = new Billing();
		System.out.printf("%.2f\n",bill.computeBill(100));
		System.out.printf("%.2f\n",bill.computeBill(100,2));
		System.out.printf("%.2f\n",bill.computeBill(100,2,1));
	}

}














