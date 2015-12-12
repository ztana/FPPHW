package w2l8;

import java.util.Iterator;
/**
 * 
 * @author 984881
 * result
 * 
f l age: 22
f2 l2 age: 23
f3 l3 age: 23
After delete l
f2 l2 age: 23
f3 l3 age: 23
Not Found age: 0

 */

class Person
{
	private String lastName;
	private String firstName;
	private int age;

	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println(firstName +" "+lastName+" age: "+age);
	}
	public String getLastName() // get only the last name
	{ 
		return lastName;
	}
} // end class Person

class PersonArrayOpe
{
	private Person[] a; // reference to array
	private int nElems; // number of data items
	private int size;

	public PersonArrayOpe(int max)
	{
		a = new Person[max];
		nElems = 0;
		size = max;
	}
	
	public Person find(String searchName) // Pass Lastname as an argument
	{ 
		for(int i=0;i<nElems;i++)
		{
			if(a[i].getLastName() == searchName)
			{
				return a[i];
			}
		}
		return new Person("Found","Not",0);
	} 
	public void insert(String last, String first, int age)// Insert at last
	{
		if(size()>=size)
			resize();
		Person newp = new Person(last,first,age);
		a[nElems] = newp;
		nElems++;
	}
	
	public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
	{
		int start = -1;
		for(int i=0;i<nElems;i++)
		{
			if(a[i].getLastName() == searchName)
			{
				start = i;
			}
		}
		if(start == -1)
			return false;
		else
		{
			for(int i=start+1;i<nElems;i++)
			{
				a[i-1] = a[i];
			}
			a[nElems] = null;
			nElems--;
			return true;
		}
	}
	public void displayAll() // displays array contents
	{
		for(int i=0;i<nElems;i++)
		{
			if(a[i] != null)
				a[i].displayPerson();
		}
	}
	public int size() // Return the number of persons stored in the array
	{
		return nElems;
	}

	private void resize(){
		Person tmp[] = new Person[size*2];
		int tIndex = 0;
		for(Person p:a)
		{
			tmp[tIndex++] = p;
		}
		a = tmp;
		size = 2*size;
	} 
}



public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonArrayOpe ar = new PersonArrayOpe(2);
		ar.insert("l", "f", 22);
		ar.insert("l2", "f2", 23);
		ar.insert("l3", "f3", 23);
		ar.displayAll();
		ar.delete("l");
		System.out.println("After delete l");
		ar.displayAll();
		Person p = ar.find("l");
		p.displayPerson();
	}

}
