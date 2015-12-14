package w3l11;

/**
 * @author 984881
 * 
 * result
Checking
Course: BBB
Faculty: Pro 4 Pro 1 Pro 3 

Retreve keys
CS000
CS001
CS390

Retreve values
Course: CCC
Faculty: Professor1 Pro 2 Pro 3 
Course: BBB
Faculty: Pro 4 Pro 1 Pro 3 
Course: FPP
Faculty: Renuka Joe Lermon Paul 

All collection
CS000=Course: CCC
Faculty: Professor1 Pro 2 Pro 3 
CS001=Course: BBB
Faculty: Pro 4 Pro 1 Pro 3 
CS390=Course: FPP
Faculty: Renuka Joe Lermon Paul 

Size:3

 */

import java.util.HashMap;
import java.util.Iterator;

class Course {

	private String c_name;
	private String[] faculty;
	
	public Course(String c_name, String[] faculty) {
		this.c_name = c_name;
		this.faculty = faculty;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getFaculty() {
		String tmp = "";
		for(String sr:faculty)
			tmp += sr+" ";
		return tmp;
	}

	
	public String toString()
	{
		return ("Course: "+getC_name()+"\nFaculty: "+getFaculty());
	}
	
	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Course> courses = new HashMap<String,Course>();
		courses.put("CS390",new Course("FPP", new String[]{"Renuka", "Joe Lermon", "Paul"}));
		courses.put("CS000", new Course("CCC",new String[]{"Professor1","Pro 2","Pro 3"}));
		courses.put("CS001", new Course("BBB",new String[]{"Pro 4","Pro 1","Pro 3"}));
		System.out.println("Checking");
		Course c = courses.get("CS001");
		if(c==null)
			System.out.println("no this course");
		else
			System.out.println(c);
		System.out.println("\nRetreve keys");
		Iterator it =  courses.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\nRetreve values");
		Iterator itv =  courses.values().iterator();
		while(itv.hasNext())
		{
			System.out.println(itv.next());
		}
		System.out.println("\nAll collection");
		Iterator itc =  courses.entrySet().iterator();
		while(itc.hasNext())
		{
			System.out.println(itc.next());
		}
		System.out.println("\nSize:"+courses.size());
	}

}
