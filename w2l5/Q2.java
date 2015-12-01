package w2l5;

import java.math.BigDecimal;

class Computer
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	Computer(String manufacturer, String processor, int ramSize,
			int diskSize) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = 16;
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

class NoteBook extends Computer
{
	NoteBook(String manufacturer, String processor, int ramSize, int diskSize,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	double height;
	double width;
	double weight;
	
	double screensize()
	{
		return height * width;
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myPC = new Computer("Dell","Inter Xron",8,1000);
		NoteBook myNote = new NoteBook("HP","Inter Core 2",8,500,40,30,2);
		System.out.println("My notebook screen size is: "+ myNote.screensize());
		System.out.println("My PC power is: "+ myPC.computPower());
	}

}
