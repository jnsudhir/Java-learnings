class Bubblesort
{
	public static void main(String[] args)
	{
		int[] arr = {12,34,5,6,1,9,0};
		//42,12
		bsort(arr);
		for(int i = 0 ; i < 7 ; i ++)
			System.out.println(arr[i]);
	}
	public static void bsort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++ )
		{
			boolean swapped = false;
			for(int j = 0 ; j < n-i-1 ; j++)
			{
				if(arr[j+1] < arr[j])
				{
					swapped = true;
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
	}
}


//https://workat.tech/codes/ir4nohu8
