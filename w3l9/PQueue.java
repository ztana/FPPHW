package w3l9;

/**
 * 
 * @author 984881
 * 
 * result
 * 
 [1, 12, 110]
 */

import java.util.Comparator;
import java.util.LinkedList;

//import w3l9.Q1.PQueue;

public class PQueue extends LinkedList{

	public static Comparator<Integer> idComparator = new Comparator<Integer>(){
        

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			int i1 = o1;
			int i2 = o2;
			return  (i1-i2);
		}
    };
    
	

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		sort(idComparator);
		return super.add(e);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> pq = new PQueue();
		pq.add(12);
		pq.add(1);
		pq.add(110);
		System.out.println(pq.toString());
	}

}
