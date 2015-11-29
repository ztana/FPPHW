package W1L3;

import java.sql.Date;
import java.sql.Time;
import java.time.*;
import java.util.*;
/**
 * 
 * @author 984881
 * result
 * 
Your speed is 1.00 unit per hour
Distance from the two cities is: 14.14.
your real travel time is:00:14:23
Your travel time with time equation is: 00:14:23


Your speed is 1.00 unit per hour
Distance from the two cities is: 100.00.
your real travel time is:02:41:45
Your travel time with time equation is: 03:19:15


Your speed is 1.00 unit per hour
Distance from the two cities is: 223.61.
your real travel time is:06:46:07
Your travel time with time equation is: 09:14:07



 */
class Location
{
	float x;
	float y;
	Location(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
}

class Cities
{
	private Cities(String name,int x, int y, ZoneId zID)
	{
		this.name = name;
		location = new Location(x,y);
		this.now = ZonedDateTime.now(zID);
	}
	private String name;
	private Location location;
	private ZonedDateTime now;
	
	public String getName() {
		return name;
	}

	public Location getLocation() {
		return location;
	}

	public ZonedDateTime getNow() {
		return now;
	}
	
	static List<Cities> cityList = new ArrayList();

		static Cities fairField; 	
		static Cities chicago;
		static Cities newYork;
		static Cities losAngeles;
		static Cities seattle;
		
		static
		{
			fairField  		= 	new Cities("FairField",		0,		0,	ZoneId.of("America/Chicago")); 
			chicago	 		= 	new Cities("Chicago",		10,	   10,	ZoneId.of("America/Chicago")); 			//CST
			newYork 		= 	new Cities("New York",		100,	0,	ZoneId.of("-05:00"));					//EST
			losAngeles 		= 	new Cities("Los Angeles",	-100,-100,	ZoneId.of("America/Los_Angeles"));		//PST
			seattle 		= 	new Cities("Seattle",		-100, 100,	ZoneId.of("America/Los_Angeles"));		//PST
			
			cityList.add(fairField);
			cityList.add(chicago);
			cityList.add(newYork);
			cityList.add(losAngeles);
			cityList.add(seattle);

		}
		
	public static Cities findCity(int cID)
	{
		if(cID<0 && cID>4)
			return null;
		return cityList.get(cID);	
	}
}

class TravelCal {
	
	private Cities cFrom;
	private Cities cTo;
	private Time mEquation;
	private Time travelTime;
	
	private final float speed;
	
	TravelCal(Cities c1, Cities c2)
	{
		speed = 1;
		cFrom = c1;
		cTo = c2;
		System.out.printf("Your speed is %.2f unit per hour\n",speed);
		calTimeOfTravel();
	}

	private void calTimeOfTravel()
	{
		//implementation
		float x,y;
		if(cFrom.getLocation().x>cTo.getLocation().x)
			x = cFrom.getLocation().x-cTo.getLocation().x;
		else
			x= cTo.getLocation().x-cFrom.getLocation().x;
		
		if(cFrom.getLocation().y>cTo.getLocation().y)
			y = cFrom.getLocation().y-cTo.getLocation().y;
		else
			y= cTo.getLocation().y-cFrom.getLocation().y;
		
		float distance = (float) Math.sqrt(x*x + y*y);
		System.out.printf("Distance from the two cities is: %.2f.\n",distance);
		
		int hour = (int)(distance/speed)/60	;
		int minute = (int)distance-hour;
		int second = (int) ((distance-hour)*100/60);	
		Time rTime = new Time(hour,minute,second);
		System.out.println("your real travel time is:"+rTime.toString());
		
		Time equation = calTimeEquation(cFrom.getNow(), cTo.getNow());
		hour = rTime.getHours() - equation.getHours();
		minute = rTime.getMinutes() - equation.getMinutes();
		second = rTime.getSeconds() - equation.getSeconds();
		hour = 	(hour < 12) ? hour : 24-hour;
		minute = (minute < 30) ? minute : 60-minute;
		second = (second < 30) ? second : 60-second;
		
		Time travelTime = new Time(hour,minute,second);
		System.out.print("Your travel time with time equation is: ");
		System.out.println(travelTime.toString()+"\n\n");
	}
	
	private Time calTimeEquation(ZonedDateTime t1, ZonedDateTime t2) {
		// TODO Auto-generated method stub
		Time t = new Time(t1.getHour()-t2.getHour(),t1.getMinute()-t2.getMinute(),t1.getSecond()-t2.getSecond());
		return t;
	}
	
	public static void main(String[] args) {
		TravelCal newT = new TravelCal(Cities.fairField,Cities.chicago);
		TravelCal newT1 = new TravelCal(Cities.fairField,Cities.newYork);
		TravelCal newT2 = new TravelCal(Cities.losAngeles,Cities.newYork);
	}

}

public class Q5 {
	
}
