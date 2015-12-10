package w2l8;

/**
 * @author 984881
 * result
 * 
list size: 3
Tom TV 100
Tim Car 200
Tem Plane 50

After sort: 
Tem Plane 50
Tom TV 100
Tim Car 200

set Tim to Com . Remove Tem who is too bad.
Com TV 110
Tom TV 100

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Marketing
{
	private String employeeName;
	private String productName;
	private int salesAmt;
	public Marketing(String employeeName, String productName, int salesAmt) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmt = salesAmt;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalesAmt() {
		return salesAmt;
	}
	public static final Comparator NAME = new Comparator(){
		public int compare(Object o1, Object o2) {
		
		//System.out.println("Name comparator is " + NAME.getClass().getName());
					
		//System.out.println(NAME.getClass());
	
			String name1 = ((Marketing)o1).getEmployeeName();
			String name2 = ((Marketing)o2).getEmployeeName();
			return name1.compareTo(name2);
		}
	};

	public static final Comparator AMT = new Comparator(){
		public int compare(Object o1, Object o2){
					
			//System.out.println("Age Comparator is  " + AGE.getClass());
		
			Integer amt1 = new Integer(((Marketing)o1).getSalesAmt()) ;
			Integer amt2 = new Integer(((Marketing)o2).getSalesAmt());
			return amt1.compareTo(amt2);
		}
	};
	public String toString()
	{
		return employeeName+" "+productName+" "+salesAmt+"\n";
	}

}

class Arraylist extends ArrayList
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Iterator it = this.iterator();
		String comp = "";
		while(it.hasNext())
			comp += it.next().toString();
		return comp;
	}

	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist ar = new Arraylist();
		ar.add(new Marketing("Tom","TV",100));
		ar.add(new Marketing("Tim","Car",200));
		ar.add(new Marketing("Tem","Plane",50));
		System.out.println("list size: "+ar.size()+"\n"+ar.toString()+"\n"+"After sort: ");
		ar.sort(Marketing.NAME);
		ar.sort(Marketing.AMT);
		System.out.println(ar.toString());
		ar.set(0, new Marketing("Com","TV",110));
		ar.remove(2);
		System.out.println("set Tim to Com . Remove Tem who is too bad.");
		System.out.println(ar.toString());
	}

}
