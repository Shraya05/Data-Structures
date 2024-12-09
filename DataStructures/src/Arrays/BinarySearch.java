package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int nums[],int low,int high,int key)
	{
		int mid=(low+high)/2;
		while(low<high)
		{
			if(nums[mid]==key)
				return mid;
			if(key>nums[mid])
			 return search(nums,mid+1,high,key);
			if(key<nums[mid])
				return search(nums,low,mid-1,key);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array");
		int n=sc.nextInt();
		int nums[]=new int[n];
		System.out.print("Enter key to search");
		int key=sc.nextInt();
		System.out.print("Enter array elements");
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		int res=search(nums,0,n-1,key);
		System.out.print("the element found at index:"+res);
	}
}
