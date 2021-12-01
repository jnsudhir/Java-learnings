import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of fibonacci number : ");
		int sum = sc.nextInt();
		System.out.println("Entered value is : " +sum);
		int output = number(sum);
		System.out.println("Output of entered fibonacci number is : " +output);
	}
	public static int number(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		int summFibonacci = number(n-1) + number(n - 2);
		return summFibonacci;
	}
}

//https://workat.tech/codes/5vidbwsf
