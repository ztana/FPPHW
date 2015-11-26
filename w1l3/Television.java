package w1l3;

/**
 * @author 984881
 * Homework Question 1 
 * result
 * 
My new TV is: Sony, 64 size.
I'm trying to use it. It's now power: Off
Trying to turn on.
I'm trying to use it. It's now power: On
I want to see channel 13
Now it's channel: 13
I can't hear voice
Now volume is: 3
Too loud
Now volume is: 2

 */
public class Television {
	
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		volume = 0;
		channel = 1;
		powerOn = false;
	}
	
	
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}


	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}

	public void power()
	{
		powerOn = !powerOn;
	}

	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void increaseVolume()
	{
		this.volume++;
	}
	
	public void decreaseVolume()
	{
		this.volume--;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television newTV = new Television("Sony",64);
		System.out.printf("My new TV is: %s, %d size.\n",newTV.getMANUFACTURER(),newTV.getSCREEN_SIZE());
		System.out.println("I'm trying to use it. It's now power: " +(newTV.powerOn ? "On":"Off"));
		System.out.println("Trying to turn on.");
		newTV.power();
		System.out.println("I'm trying to use it. It's now power: " +(newTV.powerOn ? "On":"Off"));
		System.out.println("I want to see channel 13");
		newTV.setChannel(13);
		System.out.println("Now it's channel: " + newTV.getChannel());
		System.out.println("I can't hear voice");
		newTV.increaseVolume();
		newTV.increaseVolume();
		newTV.increaseVolume();
		System.out.println("Now volume is: " + newTV.getVolume());
		System.out.println("Too loud");
		newTV.decreaseVolume();
		System.out.println("Now volume is: " + newTV.getVolume());
	}

}
