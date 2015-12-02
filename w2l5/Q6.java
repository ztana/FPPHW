package w2l5;
/**
 * 
 * @author 984881
 * result
 * 
true
true
 */

class Computer2
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	Computer2(String manufacturer, String processor, int ramSize,
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskSize;
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer2 other = (Computer2) obj;
		if (diskSize != other.diskSize)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double
				.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}

}

class NoteBook2 extends Computer implements Cloneable
{
	NoteBook2(String manufacturer, String processor, int ramSize, int diskSize,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	@Override

	  public Object clone() throws CloneNotSupportedException {

		NoteBook2 clone=(NoteBook2)super.clone();	   
	    return clone;

	  }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook2 other = (NoteBook2) obj;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double
				.doubleToLongBits(other.width))
			return false;
		return true;
	}

	double height;
	double width;
	double weight;
	
	double screensize()
	{
		return height * width;
	}
}



public class Q6 {

	private NoteBook2 myPC3;
	public Object clone() throws CloneNotSupportedException {
		
		 Q6 c=(Q6)super.clone(); 
		 // Need to clone the Address reference variable too
		 c.myPC3 = (NoteBook2)this.myPC3.clone();
		 return c;

	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Computer2 myPC = new Computer2("Dell","Inter Xron",8,1000);
		Computer2 myPC2 = new Computer2("Dell","Inter Xron",8,1000);
		NoteBook2 myNT = new NoteBook2("Dell","Inter Xron",8,1000, 100, 23, 9);
		System.out.println(myPC.equals(myPC2));

		NoteBook2 nt = (NoteBook2) myNT.clone();
		System.out.println(nt.equals(myNT));
	}

}
