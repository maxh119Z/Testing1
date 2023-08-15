package games;

public class lottery 
{

	private int prize;
	private int price;
	private String chances;
	public String expirationDate;
	private int balance;

public lottery (int money, int price, String chances, String expirationDate, int balance)
	{
		this.prize = 0;
		this.price = 0;
		this.chances = chances;
		this.expirationDate = "10/25/2021";
		this.balance = 0;
	}
	public int setBalance (int v )
	{
		return balance = v;
	}
	
	public int setPrize (int a)
	{
		return prize= a;
	} 
	
	public int getPrice ()
	{
		return price;
	}

	public int setPrice (int b)
	{
		return price=b;
	} 
	
	public int getPrize ()
	{
		return prize;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public String setChances ()
	{
		return chances;
	}
	
	public String getExpirationDate()
	{
		return expirationDate;
	}
}