package Calculator;

import java.util.Scanner;
import java.lang.Math;

public class MainCalculation 
{

	public static void main(String[] args) 
	{
			Scanner calculations = new Scanner(System.in); //scanner for the question
			
			System.out.println("What calculation do you want to do? \n"); // asking what calculation part
			System.out.println("Type 1 for addition!");
			System.out.println("Type 2 for subtraction!");
			System.out.println("Type 3 for multiplication!");
			System.out.println("Type 4 for division!");
			System.out.println("Type 5 for powers!");
			System.out.println("Type 6 for prime factorization!");
			System.out.println("Type 7 for total number of divisors in an integer.");
			System.out.println("Type 8 for product of divisors in an integer.");
			System.out.println("Type 9 for circle area!");
			System.out.println("Type 10 for square roots!");
			System.out.println("Type 11 to convert to binary!");
			System.out.println("Type 12 for gcd!");
			
			int Answer = calculations.nextInt(); //answer
	
		
			if (Answer == 1) //decimal addition
				
				{
						System.out.print("Ok! Please type the two numbers you want to add. (Ex: 12.31 4231)  Numbers: ");
						Scanner addition = new Scanner(System.in);
						
						double integer1 = addition.nextDouble();
						double integer2 = addition.nextDouble();
		
						double sumdecimaladdition = integer1 + integer2;
					
						System.out.println("Your answer is " + sumdecimaladdition);
				
				}
			
			else if (Answer == 2)	//decimal subtraction
				
				{
				
						System.out.print("Ok! Please type the two numbers you want to subtract! (Ex: 455 3.2) Numbers: ");
						Scanner subtraction = new Scanner(System.in);
						
						double integer1 = subtraction.nextDouble();
						double integer2 = subtraction.nextDouble();
						double sumdecimalsubtraction = integer1 - integer2;
					
						System.out.println("Your answer is " + sumdecimalsubtraction);
						
				}
			
			else if (Answer == 3)	//decimal multiplication
				
				{
			
					System.out.print("Ok! Please type the two numbers you want to multiply! (Ex: 544 43.2) Numbers: ");
					Scanner multiplication = new Scanner(System.in);
					
					double integer1 = multiplication.nextDouble();
					double integer2 = multiplication.nextDouble();
					double sumdecimalmultiplication = integer1 * integer2;
				
					System.out.println("Your answer is " + sumdecimalmultiplication);
				
				}
			
			else if (Answer == 4)	//decimal division
				
				{
				
					System.out.print("Ok! Please type the two numbers you want to multiply! (Ex: 544 43.2) Numbers: ");
					Scanner division = new Scanner(System.in);
					
					double integer1 = division.nextDouble();
					double integer2 = division.nextDouble();
					double sumdecimaldivision = integer1 / integer2;
				
					System.out.println("Your answer is " + sumdecimaldivision);
					
				}
			
			else if (Answer == 5)	//powers
					
					{
				
						System.out.print("Ok! Please type the power you need! (First number is the integer and second number is the power) Numbers: ");
						Scanner powers = new Scanner(System.in);
						
						double integer1 = powers.nextDouble();
						double integer2 = powers.nextDouble();
						
						double power = Math.pow(integer1, integer2);
					
						System.out.println("Your answer is " + power);
						
					}
			
			else if (Answer == 6) //prime factorization
					
					{	
			
							int number;
						      Scanner primefactorization = new Scanner(System.in);
						      System.out.println("Enter a number:");
						      number = primefactorization.nextInt();
						     
						      for(int i = 2; i< number; i++) 
						      {
						         while(number%i == 0) //% means remainder
							         {
							            System.out.println(i+" ");
							            number = number/i;
							         }
						      }
						      
						      if(number >2)
						      	{
						    	  System.out.println( number);
						      	}
					}
			
			else if(Answer == 7) //t(n) of an integer
			{
				
				int result = 0;
				
				System.out.println("Please insert the number you want to find the total divisors of.");
				Scanner totalnumber = new Scanner(System.in);
				int integer = totalnumber.nextInt();
	
		        for (int i = 1; i <=integer; i++) 
		        {
		            if (integer % i == 0) //% means remainder
		            {
		                result++;
		            }
		        }

		       System.out.println("Total number of divisors : " + result);
			     
			}
			
			else if (Answer == 8)	//product of divisors in an integer
				
			{
				int result = 0;
				
				System.out.println("Please insert your number.");
				Scanner totalnumber = new Scanner(System.in);
				
				int integer = totalnumber.nextInt();
	
		        for (int i = 1; i <=integer; i++) 
		        {
		            if (integer % i == 0) //% means remainder
		            {
		                result++;
		            }
		        }
		        
		        double product = Math.pow(integer, result/2);
		        
		        System.out.println("Product: " + integer + "^" + result + " Or " + product); //result
		        							
			}
			
			else if (Answer == 9)	//circle area
				
			{
			
					System.out.print("Ok! Please type the radius of the circle you want the area for! Radius: ");
					Scanner circlearea = new Scanner(System.in);
					
					double radius = circlearea.nextDouble();
					double area = radius * radius * Math.PI;
				
					System.out.println("Area of your circle is: " + area);
					
			}
			
			else if (Answer == 10)	//square root
				
			{
			
					System.out.print("Please type the number that you need its square root for! Number: ");
					Scanner squareroot = new Scanner(System.in);
					
					double integer = squareroot.nextDouble();
					double answer = Math.sqrt(integer);
				
					System.out.println("Square Root: " + answer + "    Round to nearest hundreths or thousanths");
					
			}
			
			else if (Answer == 11)	//Conversion to binary
				
			{
					
					Scanner binary = new Scanner(System.in);
				
					System.out.print("Please type the number that you need to convert to binary! Number: ");
					int integer = binary.nextInt();
					
					String binarytext = Integer.toBinaryString(integer);
					
					System.out.println("Binary form: " + binarytext);
					
			}
			
			else if (Answer ==12) //greatest common divisor
			{
				Scanner gcd = new Scanner(System.in);
				
				System.out.println("Please type your two numbers: ");
				int integer1 = gcd.nextInt();
				int integer2 = gcd.nextInt();
				int greatestcommondivisor = 0;
				
				if(integer1 != 0 && integer2 != 0)
				{
					for(int i = 1; i<=integer1 && i<=integer2; i++)
					{
						if(integer1%i== 0 && integer2%i== 0)
						{
							greatestcommondivisor = i;
						}		
					}
					
					System.out.println("The gcd of your two numbers are: " + greatestcommondivisor);
				}
		
			}
			
			else if(Answer == 13)
			{
				Scanner lcm = new Scanner(System.in);
				
				System.out.println("Please type your two numbers: ");
				int integer1 = lcm.nextInt();
				int integer2 = lcm.nextInt();
				int leastcommonmultiple = 0;
				
				if(integer1 != 0 && integer2 != 0)
				{
					for(int i = 1; i <= integer1*integer2; i++)
					{
						if(i%integer1==0 && i%integer2==0 && i>=integer1 && i>=integer2)
						{
							leastcommonmultiple = i;
							break;
						}
					} 
					
				System.out.println("Your least common multiple is: " + leastcommonmultiple);
				}
				
				
			}
	}

}
			
		