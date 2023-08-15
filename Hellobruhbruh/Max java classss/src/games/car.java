
package games;

import java.util.Scanner;

public class car 
{

		private String color;
		private int gas;
		public int weight;
		public int position = 0;
		public int distance;
		public String type;
		public int date;
		public int speed;
		
		public car(String color, int weight, String type, int date, int distance, int speed) 
		{
			this.color = color;
			this.weight = weight;
			this.position = 0;
			this.gas = 0;
			this.type = type;
			this.date = date;
			this.distance = 0;
			this.speed = 0;
		}
		
		public void changeColor (String a)
		{
				 
				this.color = a;
		}
			
		public void changeType (String b )
		{
			
				this.type = b;
		} 
			
		
		public int changeWeight (int m)
		{
			
				weight = m;
				return weight;
		}
			
			
			
			
		public void drive(int distance) 
			{
				
				if (gas > distance)
				{
					position += distance;
					System.out.println("Your car has enough gas and drove without failure! Your doggo, CarDriver is very happy" );
				} 
				
				else 
				{
					System.out.println("Not enough gas! :( \n Pls refuel your gas tank before trying to drive again! \n \n How many miles do you want to refuel? The maximum is 100. Enter a number");
					Scanner crap = new Scanner (System.in);
					gas = crap.nextInt();  
					
					if (gas<=100)
					{
						System.out.println("You have successfully refilled " +  gas +" gas \n wanna drive again now? Type yes or no");
						
						Scanner scan = new Scanner (System.in);
						String answer = scan.next(); 
						String y = "yes";
						String n = "no";
						
						if (answer.equals(y))
						{
							System.out.println("Great! How many miles do you want to drive?");
							int x= scan.nextInt(); // x is the miles you want to drive
							
							if (x <=  gas)
							{
							
								position += distance;
								System.out.println("Your car has enough gas and drove without failure! Your doggo, CarDriver is very happy" );
							} 
							
							else
							{
								System.out.println("Not enough gas! Your dog is super sad and decided to jump off the empire state building. Your car somehow grew legs and did the same");
							
							
							}
							
							
						}
						
						else 
						{
							System.out.println("Oof, i guess we can drive another time.");
					
						}
					}
						else 
						{
						System.out.println("Your car broke from too much gas! Pls restart this command to start again!");
						}
				}
		}
			
			public int refuel(int a) 
			{
				
				gas = a;
				return gas;
			}
			
			public String getColor () 
			{
				
				return color;
			}  
			
			public int getFuel ()
			{
				
				return gas;
			}
			
			public String getType ()
			{
				
				return type;
			}
			
			
			public int getDate ()
			{
				
				return date;
			}
			
			public int setDate (int p)
			{
				
				return date = p;
			}
			
			public int setMaxFuel(int y)
			{
				
				return gas=y;
				
			}
		
			public int getMaxFuel()
			{
				
				return gas;
			}
			
			public int setSpeed (int we)
			{
				
				return speed = we;
			}
				
			public int getSpeed ()
			{
				
				return speed;
			}
				
	}
	
