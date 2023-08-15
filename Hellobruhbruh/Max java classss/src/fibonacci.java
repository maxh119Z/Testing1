
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacci(25);
	}
	
	public static int  fibonacci (int n)
	{  
			
			int preNumber = 0;
			int NextNumber = 1;
			int sum = 0;
	 
			if(n == 0 || n == 1) {
				return 0;
			}
			else
			{
				for (int i=1; i<= n;  i++)
				{
					System.out.println(sum);
					 sum = preNumber + NextNumber;
					 preNumber = NextNumber;
					 NextNumber = sum;	
				}
				}
			return sum;
		
	}

}
