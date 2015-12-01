package w2l5;

import java.util.Scanner;

/**
 * 
 * @author 984881
 * result
 * 
Type	C – for Circle
.	R – for Rectangle
.	T – for Triangle
C
Type radius of Circle: 
12.4
Area of this shape is: This is Circle, Radius is: 12.4
Area of this shape is: 482.80640000000005
Perimeter of this shape is: 77.872


Type	C – for Circle
.	R – for Rectangle
.	T – for Triangle
T
Type base of RtTriangle: 
3
Type height of RtTriangle: 
4
Area of this shape is: This is RT Triangle, Base is: 3.0, Height is: 4.0
Area of this shape is: 6.0
Perimeter of this shape is: 12.0




 */

abstract class Shape
{
	protected String shapeName;
	
	public String getShapeName()
	{
		return shapeName;
	}
	
	public abstract String toString();
	
	public abstract double computeArea();
	
	public abstract double computePerimeter();
	
	public abstract void readShapeData();
	
}

class Rectangle extends Shape
{
	private double width;
	private double height;
	
	public Rectangle() {
		this.shapeName = "Rectangle";
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is "+this.shapeName+", Width is: "+ width+", Height is: "+height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*width + 2*height;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type width of Rectangle: ");
		setWidth(sc.nextDouble());
		System.out.println("Type height of Rectangle: ");
		setHeight(sc.nextDouble());
	}
}

class Circle extends Shape
{
	private double radius;
	public Circle() {
		this.shapeName = "Circle";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is "+this.shapeName+", Radius is: "+ radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*3.14;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type radius of Circle: ");
		setRadius(sc.nextDouble());
	}
	
}

class RtTriangle extends Shape
{
	private double base;
	private double height;
	public RtTriangle() {
		this.shapeName = "RT Triangle";
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is "+this.shapeName+", Base is: "+ base+", Height is: "+height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return base*height/2;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return Math.sqrt(base*base+height*height)+base+height;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type base of RtTriangle: ");
		setBase(sc.nextDouble());
		System.out.println("Type height of RtTriangle: ");
		setHeight(sc.nextDouble());
	}
	
}


public class Q5 {

	static Shape getShape()
	{
		System.out.println("Type	C – for Circle\n.	R – for Rectangle\n.	T – for Triangle");
		Scanner sc = new Scanner(System.in);
		switch(sc.next())
		{
		case "C":
			return new Circle();
		case "R":
			return new Rectangle();
		case "T":
			return new RtTriangle();
		default:
			return null;
		}
	}
	//class Rectangle 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = getShape();
		if(!s.equals(null))
		{
			s.readShapeData();
			System.out.println("Area of this shape is: "+s.toString());
			System.out.println("Area of this shape is: "+s.computeArea());
			System.out.println("Perimeter of this shape is: "+ s.computePerimeter());
		}
	}

}
