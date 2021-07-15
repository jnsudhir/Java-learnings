class WorkAtTech
{
	static int arr[] = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	public static void main (String[] args)
	{
		// your code goes here
		
		int sumOfArray = sum();
		System.out.println(sumOfArray);
	}
	public static int sum()
	{
		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++)
			sum = sum + arr[i];
		return sum;
	}
}
