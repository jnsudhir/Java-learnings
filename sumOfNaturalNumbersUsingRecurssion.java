import java.util.Scanner;
class NaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Entered value is : " +n);
		int value = rec(n);
		System.out.println("Sum of entered value is :" +value);

	}
	public static int rec(int n)
	{
		if(n==0)
		{
			return n;
		}
		else
		{
			int sum = n+rec(n-1);
			return sum;
		}
	}
}

//https://workat.tech/codes/5vidbwsf
