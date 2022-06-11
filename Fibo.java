import java.util.*;  
class Fibo
{
	public static void main(String args[])
	{
		int a = 0,c = 1;
		System.out.println("Enter a number to generate fibonacci series for first n numbers : ");
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
		System.out.print("The first " + num + " Fibonacci numbers are: ");
		System.out.print(a + " " + c);
		int i = 1;
		while (i<num-1)
        {
			int sum = a + c;
            a = c;
            c = sum;
            System.out.print(" " + sum);
            i++;
        }
  
	}
}