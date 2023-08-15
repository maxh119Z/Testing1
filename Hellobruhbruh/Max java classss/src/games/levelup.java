package games;

public class levelup 

{
	public int cost;
	public String boosts;
	public int level;
	public String newstuff;

public levelup (int cost, String boosts, int level, String newstuff)
	{
		this.cost = 200000;
		this.boosts = boosts;
		this.level = 0;
		this.newstuff = newstuff;
	} 

		public int setCost(int a)
		{
			return cost = a;
		} 
		
		public String setboosts (String b)
		{
			return boosts = b;
		} 
		
		public int setLevel (int c)
		{
			return level = c;
		} 
		
		public String setNewstuff (String d)
		{
			return newstuff = d;
		}
		
		public String getboosts ()
		{
			return boosts;
		}
		
		public String getNewstuff ()
		{
			return newstuff;
		}
		
		public int getCost()
		{
			return cost;
		}
		
		public int getLevel ()
		{
			return level;
		}
	
}
