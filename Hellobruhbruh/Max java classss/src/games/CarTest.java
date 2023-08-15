package games;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.Instant;

public class CarTest 
{

	public static void main(String[] args)
	{
		
		//objects
		lottery crud = new lottery (10000, 10, "1/100", "10/25/2020", 100);
	    levelup levels = new levelup (25000, "Boosts: \n  -more gas! \n  -more modern car!",1, "New features! \n  -car speed!");
	    daily coins = new daily (10000, 24, 1, 7, 10);
		car lol = new car ("blue", 2350, "Toyota", 1998, 0, 15);
		
		
		crud.setBalance(100);
		levels.setLevel(1);
		
		boolean repeat = true;
		Instant start = Instant.now();
		Instant letgo = Instant.now();
		Instant gonow = Instant.now();
	
			System.out.println("The time is: "+ start);
			
			if (levels.getLevel()==1)
				{
				
					lol.setMaxFuel(150);
					lol.setDate(2005);
					
				}
			
			else if (levels.getLevel()==2)
				{
				
					lol.setMaxFuel(250);
					lol.setDate(2005);
					
				}
			
		while (repeat==true)
		
			{
				
		System.out.println("please type, 'pls game actions' to get started!");
		String qer= new String ("pls car actions");
		String yousuck =new String ("pls car actions");
		
			if (qer.equals(yousuck))
				{
					Scanner poop = new Scanner (System.in);
					String a = poop.next();
					
					System.out.println("What do you want to do? Type exactly what it says or else you will restart\n  Type \n a. for car info \n b for car drive \n c for lottery chances \n d for car level up info \n e for car level up \n f for daily coins \n g for bank account \n h for hourly coins \n i for free cash");
			
					Scanner scan = new Scanner(System.in);
					String f = new String ("a");
					
					String mom = new String ("c");
					String w = scan.next();
		
			
			String string1 = "red";
			String string2 = "black";
			String string3 = "blue";
			String string4 = "green";
			String string5 = "gold";
		

		int 	random = ThreadLocalRandom .current()  .nextInt(1, 10);
		
			if (random == 1)	
			{
				lol.changeColor("red") ;
			}	
			
			else if (random == 2)	
			{
				lol.changeColor("green") ;
			} 	
			
			else if (random == 3)
			{
				lol.changeColor("black") ;
			}	
			
			else if (random == 4)
			{
				lol.changeColor("gold") ;
			}	
			
			else if (random == 5)	
			{
				lol.changeColor("diamond") ;
			} 	
			
			else if (random == 6)	
			{
				lol.changeColor("brown") ;
			} 
			
			else	if (random == 7)	
			{
				lol.changeColor("purple") ;
			}	
		
			else if (random == 8)
			{
				lol.changeColor("orange") ;
			}
			
			else if (random == 9)
			{
				lol.changeColor("yellow") ;
			}
			
			else	
			{
				lol.changeColor("rainbow") ;
			}	
			
			
		int cool = ThreadLocalRandom .current()  .nextInt(1, 20);
		
			if (cool == 1)
			{
				lol.changeType("Toyota") ;
			}
			
			else if (cool == 2)
			{
				lol.changeType("BMW") ;
			}
			
			else if (cool == 3)
			{
				lol.changeType("Lexus") ;
			}
			
			else if (cool == 4)
			{
				lol.changeType("PickUp Truck") ;
			}
			
			else if (cool == 5)
			{
				lol.changeType("Mercedes Benz") ;
			}
			
			else if (cool == 6)
			{
				lol.changeType("Mini Van") ;
			}
			
			else if (cool == 7)
			{
				lol.changeType("Truck") ;
			}
			
			else if (cool == 8)
			{
				lol.changeType("Honda") ;
			}
			
			else  if (cool == 9)
			{
				lol.changeType("Monster Car") ;
			}
			
			else if (cool == 10)
			{
				lol.changeType("Sports car") ;
			}
			
			else if (cool == 11)
			{
				lol.changeType("Ford") ;
			}
			
			else if (cool == 12)
			{
				lol.changeType("Tesla") ;
			}
			
			else if (cool == 13)
			{
				lol.changeType("Nissan") ;
			}
			
			else if (cool == 14)
			{
				lol.changeType("Ferrari") ;
			}
			
			else if (cool == 15)
			{
				lol.changeType("Acura") ;
			}
			
			else if (cool == 16)
			{
				lol.changeType("Lamborghini") ;
				System.out.println("HOLY GOSH! YOU GOT A LAMBO! YOOOOOOOOOOOOOOOOOOO! You will get money for this.");
				crud.setBalance(2000+crud.getBalance());	
				System.out.println("You now have: $"+ crud.getBalance());
			}
			
			else if (cool == 17)
			{
				lol.changeType("Volvo") ;
			}
			
			else if (cool == 18)
			{
				lol.changeType("Mazda") ;
			}
			
			else if (cool == 19)
			{
				lol.changeType("Chevrolet") ;
			}
			
			else if (cool == 20)
			{
				lol.changeType("Volkswagen") ;
			}
		
		int dang = ThreadLocalRandom .current()  .nextInt(1, 10);
		
		//changing gas randomly
		for (int i=1; i<= 10; i++)
			{
				if (dang== i)
				lol.refuel(i*10);
			}
		
		//changing weight randomly
		
		for (int n = 1; n<=10; n++)	
			{
				if (dang== n)
					lol.changeWeight(n*100+2000);
			}
		
				String info = new String ("d");
				String leveling = new String ("e");
				String coin = new String ("f");
			
			if (w.equals(f))
			{
				System.out.println("Car info (You will get a different car everytime you play again, but your bank will stay the same as well as your upgrades)");
			
				if (levels.getLevel()==1)
					{
						System.out.println("Car color: "+lol.getColor());
						System.out.println("Car weight: "+lol.weight +" pounds");
						System.out.println("Car Type: "+ lol.getType());
						System.out.println("Car Date manufactured: " + lol.getDate());
						System.out.println("Gas: "+ lol.getFuel()+ "/100");
					} 
				
				else if (levels.getLevel()== 2)
				{
					System.out.println("Car color: "+lol.getColor());
					System.out.println("Car weight: "+lol.weight +" pounds");
					System.out.println("Car Type: "+ lol.getType());
					System.out.println("Car Date manufactured: " + lol.getDate());
					System.out.println("Gas: "+ lol.getFuel()+ "/150");
						lol.setSpeed(50);
					System.out.println("Car speed: "+lol.getSpeed()+" miles per hour" );
				}
			
			}
			
			
			else if (w.equals("i")) 
				
			{
				System.out.println("Are you sure you want to beg for free money? Type yes or no");
				Scanner beg = new Scanner (System.in);
				String yeah = beg.nextLine();
				Instant sec = Instant.now();
				Duration thirty =	Duration.between(gonow,sec);
			
				if (yeah.equals("yes"))
				{
					if (thirty.toMillis()>30000)
						{
							gonow = Instant.now();
							System.out.println("Ok, now please type 'alexa, please beg' Keep in note that if you spell anything wrong, the game will either do a random command or just type nothing.");
							String yessir = beg.nextLine();
							int 	trashcan = ThreadLocalRandom .current()  .nextInt(1, 3);
							
						if (yessir.equals("alexa, please beg"))
							{
								System.out.println("Ok, begging...");
								int i = ThreadLocalRandom .current() . nextInt (1,10);
								crud.setBalance(crud.getBalance()+i*100);
								System.out.println("Congrats! You have convinced the stranger and you now have: $"+crud.getBalance())	;
				
					
							}
					
							else
								System.out.println("You did not convince the stranger, his response is: 'Stop asking for money you bastard'");
						
						}
					
					else
						System.out.println("Gosh, wait a bit bro, you are actually impatient dude, like bruh.");
					
				}		
			}
			
			else if (w.equals("h")) 
				{
					Instant hour = Instant.now();
					Duration Elapsedtime = Duration.between(start, hour);
				
				if (Elapsedtime.toHours() > 1) 
					{
						start = Instant.now();
						coins.setHours(1000);
						crud.setBalance(crud.getBalance()+coins.getHours());
						System.out.println("Congrats! You got $" + coins.getHours() + " and you now have $" + crud.getBalance());
					}
				
				else 
					{
						System.out.println("Please wait and do something else.");
					}
				
				}
			
			else if (w.equals(coin))
				{
			
					//your code
					Instant end = Instant.now();
					Duration timeElapsed = Duration.between(letgo, end);
				
					if (timeElapsed.toHours()>24)
						{
							coins.setgift(10000);
							int dailystuff = crud.getBalance()+coins.getgift();
							crud.setBalance(dailystuff);
							letgo = Instant.now();
							
							System.out.println("Congrats! You got "+ coins.getgift()+"! You now have: $" + crud.getBalance());
							System.out.println("Please wait 24 hours before trying this command again. Type ok to do something else. You can get your daily again in: "+end);
					
							Scanner willscan = new Scanner (System.in);
							String mod = willscan.nextLine();
							
							if (mod == "1ajdfijaoidfdjfkd") 
								{
									System.out.println("How the heck did you type this?");
								} 
							
							else
							{
								System.out.println("Please wait or rerun command.");
							}
							
					}
					
						else
						{
							System.out.println("Your time is not up yet. Please come back later.");
						}
					
				}
			
			else if (w.equals(info))
				{
					if (levels.getLevel()==1)
					{
						System.out.println("\nLevel up info! \nCar level up cost: $" + levels.setCost(25000));
						System.out.println(levels.getboosts());
						System.out.println("Your car level: "+levels.setLevel(1));
						System.out.println(levels.getNewstuff());
					} 
					
					else if (levels.getLevel()==2)
					{
						System.out.println("Level 2 will get you more modern car and more maximun engine");
					}
				}
			
			
			else if (w.equals(leveling))
				{
				
					System.out.println("Are you sure you want to spend $" + levels.getCost()+"?");
					Scanner scanYN = new Scanner (System.in);
					String sure = scanYN.nextLine();
					String yes = new String ("yes");
					String no = new String ("no");
					
					if (sure.equals(yes))
						{
							try 
							{
								Thread.sleep(2000);
							} 
							
							catch (InterruptedException e)
							{
								e.printStackTrace();
							}
							
							System.out.println("Upgrading...");
							
						if (levels.getLevel()>1)
						{
							if (crud.getBalance()>levels.getCost())
							{
								
								crud.setBalance(crud.getBalance()-levels.getCost());
								levels.setLevel(3);
								System.out.println("Congrats! Your car is now level "+ levels.getLevel() +"\nYou now have: $"+crud.getBalance()+" in your bank account!"+"\n");
								lol.setMaxFuel(250);
								lol.setDate(2010);
								System.out.println("\nNew car stats");
								System.out.println("Car color: "+lol.getColor());
								System.out.println("Car weight: "+lol.weight +" pounds");
								System.out.println("Car Type: "+ lol.getType());
								System.out.println("Car Date manufactured: " + lol.getDate());
								System.out.println("Gas: "+ lol.getFuel()+ "/250");
								lol.setSpeed(50);
								System.out.println("Car speed: "+lol.getSpeed()+" miles per hour" );
							
							
							}
						}
						
						else
						{
							if (crud.getBalance()>levels.getCost())
							{
								int balancebuy=	crud.getBalance()-levels.getCost();
								crud.setBalance(balancebuy);
								lol.setMaxFuel(150);
								levels.setLevel(2);
								
								System.out.println("Congrats! Your car is now level "+ levels.getLevel() +"\nYou now have: $"+crud.getBalance()+" in your bank account!"+"\n");
								System.out.println("\nNew car stats");
								System.out.println("Car color: "+lol.getColor());
								System.out.println("Car weight: "+lol.weight +" pounds");
								System.out.println("Car Type: "+ lol.getType());
								System.out.println("Car Date manufactured: " + lol.getDate());
								System.out.println("Gas: "+ lol.getFuel()+ "/"+lol.getMaxFuel());
								lol.setSpeed(50);
								System.out.println("Car speed: "+lol.getSpeed()+" miles per hour" );
								
								
							}
							
							else 
							{
								System.out.println("You don't have enough money!");
							}
						}
					}
						else if (sure.equals(no))
						{
							System.out.println("Ok then. Guess you can upgrade another time");
						}
						
						else
						{
							System.out.println("That's not even what I asked!");
						}
				}
			
			else if (w.equals("g"))
			{
				System.out.println("Your bank account has: $"+crud.getBalance());
			}
			
			else if (w.equals(mom))
			{
					System.out.println("What lottery do you want to do? \n    Z for lottery info \n    Y for spin lottery");
					Scanner bob = new Scanner (System.in);
					String kap = bob.nextLine();
					String bruh = new String ("z");
					String bru = new String ("Z");
					String br = new String ("Y");
					String rub = new String ("y");
					
					if (kap.equals(bruh)|| kap.equals(bru))
					{
						System.out.println("Grand Prize: $?");
						int 	n95 = ThreadLocalRandom .current()  .nextInt(1, 10);
						
						for (int b =1; b<=10; b++)
						{
							if (n95 == b)
							{
								crud.setPrice(n95*5);
							}
						}
						
						System.out.println("Ticket Cost: $"+crud.getPrice());
						System.out.println("Chances of winning: " + crud.setChances());
						System.out.println("Date Expires: "+crud.getExpirationDate());
						System.out.println("Your bank account: "+crud.getBalance());
						
					}
					
					else if (kap.equals(br)|| kap.equals(rub))
						{ 
								
							int 	moment = ThreadLocalRandom .current()  .nextInt(1, 100);
							Scanner momdd = new Scanner (System.in);
							System.out.println("Are you sure you want to do the lottery? Type yes or no");
							String qw = momdd.nextLine();
							String kill = new String ("yes");
							String sus = new String ("no");
							int max = ThreadLocalRandom .current()  .nextInt(1, 100);
							
						if (qw.equals(kill))
							{
								int probs = ThreadLocalRandom .current()  .nextInt(1, 10);
								for (int c = 1; c<=10; c++)
								{
									if (c==probs)
									{
										crud.setPrice(c*5);
									}
								}
								
								System.out.println("The price of your ticket is: $"+ crud.getPrice() +"\nYour bank account has: $"+ crud.getBalance());
				
								try
								{
									TimeUnit.SECONDS.sleep(1);
								} 
								
								catch (InterruptedException e) 
								{
									
									e.printStackTrace();
								}
								System.out.println("Rolling...");
								
						try
						{
							TimeUnit.SECONDS.sleep(2);
						} 
						
						catch (InterruptedException e)
						{
						
							e.printStackTrace();
						}
						
							if (moment == 1)
							{
								System.out.println("Congrats! You won the grand prize!");
								for (int n = 1; n<=10; n++)	
								{
									
									if (dang== n)
										crud.setPrize(n*50000+50000);
									
								}
							
								int mna = crud.getPrize()+crud.getBalance()-crud.getPrice();
								crud.setBalance(mna);
								System.out.println("Your bank account is now: $"+crud.getBalance());
							}
							
							else 
							{
								int balanceprice= crud.getBalance()-crud.getPrice();
								crud.setBalance(balanceprice);
								System.out.println("You did not win. It kinda sucks to suck. \nYour bank account now has: $" +crud.getBalance());
							
						
							} 
						}
						
						else if (qw.equals(sus))
						{
							System.out.println("Ok then, good idea not to run, your chances of winning are super low.");
						
						}
						
					}
			}
			
			else
				{
				
				System.out.println("How many miles do you want to drive? Please type in a number.");
				int b = scan.nextInt();
				lol.drive (b);
					
				}
			
							
			}
			
			else 
			{
				System.out.println("error");
			}
			
		System.out.println("\nDo you want to play again? \n Please type yes or no");
		Scanner repeater = new Scanner (System.in);
		String answer = repeater.nextLine();
		
		if (answer.equals("yes"))
			repeat = true;
		
		else 
		{
			System.out.println("Ok then, type 'ok' once you want to play again.");
			Scanner again = new Scanner (System.in);
			String willplay = again.nextLine();
			
			if (willplay.equals("ok")) 
				repeat= true;
			
			else 
			{
				System.out.println("I told you to type ok. You did not follow the directions and for that, I will restart your game stats");
				repeat = false;
			}
						
		} 		
		
		}	

	}
}

