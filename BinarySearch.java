import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySearch
{
	static int binarySearch(int[] arr,int startIndex , int endIndex , int reqNum)
	{
		if(startIndex > endIndex)
		{
			return -1;
		}
			
		int midIndex = (startIndex + endIndex)/2;
		if(arr[midIndex] == reqNum)
		{
			return midIndex;
		}
			
		if(arr[midIndex] > reqNum)
		{
			return binarySearch(arr , startIndex , midIndex - 1 , reqNum);
		}
		else
		{
			return binarySearch(arr , midIndex + 1 , endIndex , reqNum);
		}
	}
		
	static int resultBinarySearch (int[] arr ,int reqNum)
		{
			return binarySearch(arr, 0,arr.length-1 , reqNum);
		}
	public static void main(String[] args) throws java.lang.Exception
	{
		int[] arr = {1, 3, 11, 12, 15, 21, 22, 23, 32, 34, 42, 45, 56, 67, 87};
		int index = resultBinarySearch(arr, 3);
		if(index != -1)
		{
			System.out.print(index);
		}
		else
		{
			System.out.println("Not found");
		}
			
	}	
}

//https://workat.tech/codes/lo9x6hyx
