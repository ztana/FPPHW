package w2l5;

import java.util.*;
/**
 * 
 * @author 984881
 * result
 * 
Select this empolyee is a screatary or a manager. 1-screatray, 2-manager: 
1
Type employee name: 
Tom
Type employee ID: 
001
Type employee SSN: 
342322
Type year of employee birth: 
1900
Type month of employee birth: 
1
Type day of employeee birth: 
1
Type address of employee: 
haven
Type hours of employee worked for a month: 
16
Type years of employee worked for : 
6
Select this empolyee is a screatary or a manager. 1-screatray, 2-manager: 
2
Type employee name: 
Tim
Type employee ID: 
002
Type employee SSN: 
3452
Type year of employee birth: 
1999
Type month of employee birth: 
1
Type day of employeee birth: 
2
Type address of employee: 
earth
Type hours of employee worked for a month: 
16
Type years of employee worked for : 
9
Type extra hours of manager worked for a month: 
10
His salary is: 176.0
His salary is: 150.0

 */
interface Employee
{
	float baseSalary = 10;
	float bonues = 2;
	float extraSalary = 15;
	Detail getEmpolyeeDetails();
	double calculateSalary();
}

class NewMan
{
	 double calculateSalary() {
		return 0;
	}
}

class Secretary2 extends NewMan implements Employee
{

	public Secretary2(int hourPerMonth, int years, Detail sDetail) {
		this.hourPerMonth = hourPerMonth;
		this.years = years;
		SDetail = sDetail;
	}

	private int hourPerMonth;
	private int years;
	private double salary;
	private Detail SDetail;
	@Override
	public Detail getEmpolyeeDetails() {
		// TODO Auto-generated method stub
		return SDetail;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		salary = baseSalary * hourPerMonth;
		if(years > 5)
			salary = salary *1.1;
		if(hourPerMonth > 150)
		{
			salary += salary * bonues * (hourPerMonth - 150);
		}
		return salary;
	}
	
}

class Manager extends NewMan implements Employee
{
	private int hourPerMonth;
	private int years;
	private double salary;
	private int extraHour;
	private Detail MDetail;
	
	public Manager(int hourPerMonth, int years, int extraHour, Detail mDetail) {
		this.hourPerMonth = hourPerMonth;
		this.years = years;
		this.extraHour = extraHour;
		MDetail = mDetail;
	}

	@Override
	public Detail getEmpolyeeDetails() {
		// TODO Auto-generated method stub
		return MDetail;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		salary = baseSalary * hourPerMonth *2 + getExtraHour()>0 ? extraHour*extraSalary:0;
		return salary;
	}

	protected int getExtraHour() {
		return hourPerMonth-150;
	}
	
}

class Detail
{
	String name;
	String ID;
	String ssn;
	Date Dob;
	String Address;
	public Detail()
	{
	}
}

public class Q4 {

	static  NewMan newEmployee()
	{

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select this empolyee is a screatary or a manager. 1-screatray, 2-manager: ");
		
		int choice = sc.nextInt();
		while(choice<1 && choice>2)
		{
			System.out.println("Select this empolyee is a screatary or a manager. 1-screatray, 2-manager: ");
			choice = sc.nextInt();
		}
		//detail
		Detail newm = new Detail();
		System.out.println("Type employee name: ");
		newm.name = sc.next();
		System.out.println("Type employee ID: ");
		newm.ID = sc.next();
		System.out.println("Type employee SSN: ");
		newm.ssn = sc.next();
		int y,m,d;
		System.out.println("Type year of employee birth: ");
		y = sc.nextInt();
		System.out.println("Type month of employee birth: ");
		m = sc.nextInt();
		System.out.println("Type day of employeee birth: ");
		d = sc.nextInt();
		newm.Dob = new Date(y,m,d);
		System.out.println("Type address of employee: ");
		newm.Address = sc.next();
		
		//hour
		System.out.println("Type hours of employee worked for a month: ");
		int hhour = sc.nextInt();
		//year
		System.out.println("Type years of employee worked for : ");
		int yyear = sc.nextInt();
		
		switch(choice){
		case 1:
			return (new Secretary2(hhour,yyear,newm));
		case 2:
			//extra(manager)
			System.out.println("Type extra hours of manager worked for a month: ");
			int exHour = sc.nextInt();
			return (new Manager(hhour,yyear,exHour,newm));
		}
		return null;//never here
	}
	
	public static void main(String[] args) {
		NewMan newSecurity = newEmployee();
		NewMan newManager = newEmployee();
		System.out.println("His salary is: "+newSecurity.calculateSalary());
		System.out.println("His salary is: "+newManager.calculateSalary());
		
	}

}
