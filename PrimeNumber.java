import java.util.*;  
class PrimeNumber
{
	public static void main(String args[])
	{
		int count =0;
		int i;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
		if(num == 0 || num == 1)
		{
			System.out.println(num + " is not a prime number");
		}
		else
		{
			for(i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
			}
			
		String out= count==0? " is prime number" : "is not a prime number";		
		System.out.println(num + out);
		}
	}
}