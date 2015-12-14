package w3l11;

/**
 * @author 984881
 * 
 * result
 * 
Enter size of hash table: 5
Enter first letter of show, insert, delete, or find: s
Table: 
Index : 0 5 
Mail ID: Person Item 2 Name: Java

Index : 1 1 
Mail ID: Person Item 1 Name: FPP

Index : 2 7 
Mail ID: Person Item 3 Name: SE

Index : 3 10 
Mail ID: Person Item 4 Name: C#

Index : 4 **

Enter first letter of show, insert, delete, or find: f
Enter key value to find: 2
Key Found statusfalse
Enter first letter of show, insert, delete, or find: f
Enter key value to find: 7
Key Found statustrue
Enter first letter of show, insert, delete, or find: 
 */

//demonstrates hash table user defined implementation with linear probing

import java.io.*;
import java.util.Scanner;

class PersonItem
{                                
	private String mail_id;  //Person E_Mail-id-Key
	private String name;  // Name of the person
	public PersonItem()
	{
		
	}
	public PersonItem(String mail_id, String name) {
		this.mail_id = mail_id;
		this.name = name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "\nMail ID: "+getMail_id()+" Name: "+getName()+"\n";
	}
}
////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
private int iData;               // data item (key)
private PersonItem value;
//--------------------------------------------------------------
public DataItem(int ii, PersonItem v)          // constructor
 { iData = ii;
   value = v;
 }
//--------------------------------------------------------------
public int getKey()
 { return iData; }
public PersonItem getValue()
{ return value; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
class HashTable
{
private DataItem[] hashArray;    // array holds hash table
private int arraySize;
private DataItem nonItem;        // for deleted items
//-------------------------------------------------------------
public HashTable(int size)       // constructor
 {
 arraySize = size;
 hashArray = new DataItem[arraySize];
 nonItem = null;   // deleted item key is -1
 }
//-------------------------------------------------------------
public void displayTable()
 {
 System.out.println("Table: ");
 for(int j=0; j<arraySize; j++)
    {
    if(hashArray[j] != null)
       System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
    else
       System.out.println("Index : " + j + " " + "**");
    }
 System.out.println("");
 }
//-------------------------------------------------------------
public int hashFunc(int key)
 {
 return key % arraySize;       // hash function
 }
//-------------------------------------------------------------
public void insert(int key, PersonItem v) // insert a DataItem
//(assumes table not full)
 {
      // extract key
 int hashVal = hashFunc(key);  // hash the key
                               // until empty cell 
//an index have some data and not match with existing key, it find next vacant position 
 while(hashArray[hashVal] != null &&
                 hashArray[hashVal].getKey() != key) 
    {
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 DataItem obj = new DataItem(key,v);
 hashArray[hashVal] = obj;    // insert item
 }  // end insert()
//-------------------------------------------------------------
public DataItem delete(int key)  // delete a DataItem
 {
 int hashVal = hashFunc(key);  // hash the key

 while(hashArray[hashVal] != null)  // until empty cell,
    {                               // found the key?
    if(hashArray[hashVal].getKey() == key)
       {
       DataItem temp = hashArray[hashVal]; // save item
       hashArray[hashVal] = nonItem;       // delete item
       return temp;                        // return item
       }
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 return null;                  // can't find item
 }  // end delete()
//-------------------------------------------------------------
public boolean find(int key)    // find item with key
 {
 int hashVal = hashFunc(key);  // hash the key

 while(hashArray[hashVal] != null)  // until empty cell,
    {                               // found the key?
    if(hashArray[hashVal].getKey() == key)
       return true;   // yes, return item
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 return false;                  // can't find item
 }
//-------------------------------------------------------------
}  // end class HashTable
////////////////////////////////////////////////////////////////
class HashTableApp
{
public static void main(String[] args) throws IOException
 {
 int aKey;
 PersonItem value = null;
                             
 Scanner in = new Scanner(System.in);
 System.out.print("Enter size of hash table: ");
 int size = in.nextInt();
                           
 HashTable theHashTable = new HashTable(size);

 theHashTable.insert(1,new PersonItem("Person Item 1","FPP"));
 theHashTable.insert(5,new PersonItem("Person Item 2","Java"));
 theHashTable.insert(7,new PersonItem("Person Item 3","SE"));
 theHashTable.insert(10,new PersonItem("Person Item 4","C#"));
 
   while(true)                   // interact with user
    {
    System.out.print("Enter first letter of ");
    System.out.print("show, insert, delete, or find: ");
    char choice = in.next().charAt(0); //Read a Char from the console
    switch(choice)
       {
       case 's':
          theHashTable.displayTable();
          break;
       case 'i':
       System.out.print("Enter key and name to insert: ");
          aKey = in.nextInt();
          value = new PersonItem();
          value.setName(in.next()); 
          System.out.println("Enter mail id: ");
          value.setMail_id(in.next());
          theHashTable.insert(aKey,value);
          break;
       case 'd':
          System.out.print("Enter key value to delete: ");
          aKey = in.nextInt();
          theHashTable.delete(aKey);
          break;
       case 'f':
          System.out.print("Enter key value to find: ");
          aKey = in.nextInt();
          System.out.println("Key Found status" + theHashTable.find(aKey));
          break;
       default:
          System.out.print("Invalid entry\n");
       }  // end switch
    }  // end while
 }  // end main()
//--------------------------------------------------------------
}  // end class HashTableApp
////////////////////////////////////////////////////////////////
