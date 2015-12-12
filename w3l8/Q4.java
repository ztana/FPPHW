package w2l8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * 
 * @author 984881
 * result
 * 
Directory: head--0
Directory: D--35
Directory: A--112
Directory: B--453
after delete
Directory: head--0
Directory: A--112
Directory: B--453

 */
class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Directory: "+name+"--"+pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory
	int lenth;

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = new Directory("head",0);
		last = new Directory("last",0);
		first.next = null;
		lenth = 0;
		//last.next = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if(first.next == null)
			return true;
		return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		Directory n = new Directory(name,pno);
		if(first.next == null)
		{
			first.next = n;
			last = n;
		}
		else
		{
			n.next = first.next;
			first.next = n;
		}
		lenth++;
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		Directory n = new Directory(name,pno);
		if(first.next == null)
		{
			first.next = n;
			last = n;
		}
		else
		{
			last.next = n;
			last = n;
			//n.next = null;
		}
		lenth++;
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		Directory o = first.next;
		first.next = first.next.next;
		lenth--;
		return o;
	}
// -------------------------------------------------------------
	public int size() {
		
		return lenth;
	}
// -------------------------------------------------------------
	public void displayList() {
		Directory cur = first; 
		int l = lenth;
		while(l !=-1)
		{
			//System.out.println(first.toString());
			cur.displayDirectory();
			cur = cur.next;
			l--;
		}
	}
// -------------------------------------------------------------
	public Directory find(String key)      // find link with given key
    {
		while(first.next != null)
		{
			if(first.name == key)
				return first;
			first = first.next;
		}
		return null;
  	}
 }



public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectoryOpr dir = new DirectoryOpr();
		dir.insertFirst("A", 112);
		dir.insertFirst("D", 35);
		dir.insertLast("B", 453);
		dir.displayList();
		dir.deleteFirst();
		System.out.println("after delete");
		dir.displayList();
	}

}
