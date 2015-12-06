package w2l7;

/**
 * 
 * @author 984881
 *
 * result
a->Andrew
b->Billy
w->Willie
 */
class Entry
{
	private char c;
	private String s;
	
/*
	Entry(char c, String s)
	{
		this.c = c;
		this.s = s;
	}
	*/
	public String toString()
	{
		return c+"->"+s+"\n";
	}

	public void setC(char c) {
		this.c = c;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
}

class MyTable
{
	Entry[] entries = new Entry[26];
	void add(char c, String s)
	{
		if(c>'A' &&c<'Z')
		{
			System.out.println("char should be lower case!");
			return;
		}
		int index = (int)(c-'a');
		entries[index] = new Entry();
		entries[index].setC(c);
		entries[index].setS(s);
	}
	public String toString()
	{
		String onR = "";
		for(Entry e:entries)
		{
			if(e!=null)
			{
				onR += e.toString();
			}
		}
		return onR;
	}
}


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t);

	}

}
