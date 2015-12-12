package w3l9;

/**
 * 
 * @author 984881
 * result
 * 
1
10
3

after remove:
10
3

peeking value:10

 */

class Array
{
	int data[];
	int max;
	
	Array()
	{
		data = new int[10];
		max = 10;
	}
	
	void setvalue(int index,int value)
	{
		while(index >= max-1)
		{
			resize();
		}
		data[index] = value;
	}

	private void resize() {
		int[] tmp = new int[max*2];
		for(int i=0;i<max;i++)
			tmp[i] = data[i];
		data = tmp;
	}



	
}

class Queue extends Array
{
	int front;
	int tail;
	int size;
	
	Queue()
	{
		front = 0;
		tail = 0;
		size = 0;
	}
	
	void add(int d)
	{
		data[size] = d;
		size++;
		tail = size;
	}
	int remove()
	{
		int d = data[front];
		size--;
		front++;
		return d;
	}
	int peek()
	{
		int d = data[front];
		return d;
	}
	int size()
	{
		return size;
	}
	boolean isEmpty()
	{
		return size==0?true:false;
	}
	public String toString()
	{
		String tmp="";
		for(int i=front;i<tail;i++)
		{
			tmp+=data[i]+"\n";
		}
		return tmp;
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.add(1);
		q.add(10);
		q.add(3);
		System.out.println(q);
		q.remove();
		System.out.println("after remove:");
		System.out.println(q);
		System.out.println("peeking value:" + q.peek());
	}

}
