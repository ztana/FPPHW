package w2l8;

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

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = new Directory("head",0);
		last = new Directory("last",0);
		first.next = null;
		//last.next = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if(first == last)
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
			n = last.next;
			last = n;
			//n.next = null;
		}
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		Directory o = first;
		first = first.next;
		return o;
	}
// -------------------------------------------------------------
	public int size() {
		int size = 0;
		while(first.next != null)
		{
			first = first.next;
			size++;
		}
		return size;
	}
// -------------------------------------------------------------
	public void displayList() {
		while(first.next != null)
		{
			//System.out.println(first.toString());
			first.displayDirectory();
			first = first.next;
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
		//dir.insertLast("B", 453);
		dir.displayList();
	}

}
