package w3l9;


/**
 * 
 * @author 984881
 * 
 * result
 * 
list is empty? false
Peeking: 13
Whole list:  13, 14, 110 

 */

import java.util.Comparator;
import java.util.Iterator;
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
    	super.add(e);
		sort(idComparator);
		return true;
	}

	public String toString() {
        Iterator<Object> it = iterator();
        if (! it.hasNext())
            return " ";

        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        for (;;) {
            Object e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(' ').toString();
            sb.append(',').append(' ');
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> pq = new PQueue();
		pq.add(12);
		pq.add(1);
		pq.add(110);
		pq.add(13);
		pq.add(14);
		pq.remove();
		System.out.println("list is empty? "+pq.isEmpty());
		pq.remove();
		System.out.println("Peeking: "+pq.peek());
		
		System.out.println("Whole list: "+pq);
	}

}
