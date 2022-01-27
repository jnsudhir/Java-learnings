class Selectionsort
{
	public static void sSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++)
		{
			int smallestNumber = i;
			for(int j = i + 1 ; j < n ; j++)
			{
				if(arr[j] < arr[smallestNumber])
				{
					smallestNumber = j;
				}
			}
			if(smallestNumber!= i)
			{
				int temp = arr[smallestNumber];
				arr[smallestNumber] = arr[i];
				arr[i] = temp;
			}
		}	
	}
	public static void main(String[] args)
	{
		int[] arr = {12,34,5,6,1,9,0};
		sSort(arr);
		for(int i = 0 ; i < 7 ; i++)
			System.out.println(arr[i]);
	}
}

//https://workat.tech/codes/wxa2k89y
