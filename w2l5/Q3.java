package w2l5;

abstract class ABComputer
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	double height;
	double width;
	double weight;
	protected double cost;
	
	ABComputer(String manufacturer, String processor, int ramSize,
			int diskSize, double height, double width, double weight) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = 16;
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.cost = 500;
	}
	
	abstract double costProdect();
	
	protected double getCost() {
		return cost;
	}

	public double getRamSize() {
		return ramSize;
	}
	public double getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public double computPower()
	{
		return ramSize * processorSpeed;
	}
}

class PC extends ABComputer
{

	PC(String manufacturer, String processor, int ramSize, int diskSize,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize, height, width, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	double costProdect() {
		// TODO Auto-generated method stub
		return super.getCost() + 100;
	}
	
}

class Laptop extends ABComputer
{

	Laptop(String manufacturer, String processor, int ramSize, int diskSize,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize, height, width, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	double costProdect() {
		// TODO Auto-generated method stub
		return super.getCost() + 50;
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABComputer p1 =  new Laptop("HP","Inter Core 2",8,500,40,30,2);
		ABComputer p2 =  new PC("Dell","Inter Core i5",8,500,40,30,2);
		System.out.println(p1.costProdect());
		System.out.println(p2.costProdect());
	}

}
