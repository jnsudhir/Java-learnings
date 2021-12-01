import java.util.Scanner;
class Recursion
{
	public static int rec(int n)
	{
		int sum;
		if(n == 0)
		{
			return 1;
		}
		else
			sum =   n*rec(n-1);
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Entered value is : " +n);
		int factorial = rec(n);
		System.out.println("factorial of entered value is : " +factorial);

	}
}
//https://workat.tech/codes/01w1ktwc
