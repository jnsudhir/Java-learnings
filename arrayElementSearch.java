class Search
{
	public static int search(int[] arr , int element)
	{
		for( int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int[] arr = {12,23,34,45,56,67,89,5};
		int element = 5;
		System.out.println( element + " is found at index : " + search(arr , element));
	}
}
