package w2l5;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 * @author 984881
 * result
 * 
Would you like to see sum of professors and secreatrys's salary? Y
sum of professors salary is: 3800.0
sum of secretarys salary is: 1650.0

 */

class DeptEmployee {
	public String name;
	protected float salary;
	protected LocalDate hireDate;
	
	DeptEmployee(String name, float salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public float computeSalary()
	{
		return salary;
	}
}

class Professor extends DeptEmployee {
	private int numberOfPublications;

	Professor(String name, float salary)
	{
		super( name,  salary);
	}
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}

class Secretary extends DeptEmployee {
	
	Secretary(String name, float salary)
	{
		super( name,  salary);
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	private double overtimeHours;
	public float computeSalary()
	{
		return (float) (salary + 12*overtimeHours);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor Tim = new Professor("Tim",1000.0f);
		Professor Tom = new Professor("Tom",1300.0f);
		Professor Tem = new Professor("Tem",1500.0f);
		
		Secretary Dom = new Secretary("Dom",800f);
		Secretary Dim = new Secretary("Dim",850f);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = Tim;
		department[1] = Tom;
		department[2] = Tem;
		
		department[3] = Dom;
		department[4] = Dim;
		
		System.out.printf("Would you like to see sum of professors and secreatrys's salary? ");
		Scanner s = new Scanner(System.in);
		if(s.next().equals("Y"))
		{
			float sum1 = 0, sum2 = 0;
			for(DeptEmployee e:department)
			{
				if(e instanceof Professor)
				{
					sum1 += e.computeSalary();
				}
				else
					sum2 += e.computeSalary();
			}
			System.out.println("sum of professors salary is: "+sum1+"\nsum of secretarys salary is: "+ sum2);
		}
	}

}
