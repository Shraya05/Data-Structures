package problems;

public class SubarraySum {
	public static void main (String args[])
	{
	int arr[]= {1,-5,4,3,10,-4};
int curr=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
	curr=Math.max(curr, arr[i]+curr);
	max=Math.max(max, curr);
}
System.out.print(max);
	}
}
