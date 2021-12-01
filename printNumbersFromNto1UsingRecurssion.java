class PrintNumbers
{
	public static void main(String[] args)
	{
		rec(1000);
	}
	public static int rec(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
			System.out.println(n);
		    int num = rec(n-1);
		    return num;

	}
}

//https://workat.tech/codes/up3ynyhz
