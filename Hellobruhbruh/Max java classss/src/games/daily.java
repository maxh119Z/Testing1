package games;

public class daily 
{
	
public int gift;
public int time;
public int day;
public int week;
public int hour;
public int hours;

public daily (int gift, int time, int day, int week, int hour)
	{
		this.gift = 0;
		this.time = 0;
		this.day = 0;
		this.week = 0;
		this.hours = 0;
	}


public int setgift (int a)
	{
		return gift = a;	
	}

public int setHours (int z)
	{
		return hours = z;
	}

public int getHours ()
	{
		return hours;
	}
public int getgift ()
	{
		return gift;
	}

public int setTime (int b)
	{
		return time = b;
	}

public int setday (int c)
	{
		return day = c;
	}

public int setWeek (int d)
	{
		return week = d;
	}

}