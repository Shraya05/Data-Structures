package Arrays;

public class QuickSort {
	public static int partition(int[] arr,int low,int high)
	{
		int i=low;
		int j=high;
		int pivot=arr[low];
		while(i<j)
		{
			while(arr[i]<=pivot && i<high)
				i++;
			while(arr[j]>pivot && j>low)
				j--;
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	public static void qs(int[] arr,int low,int high)
	{
		if(low<high)
		{
		int pindex=partition(arr,low,high);
		qs(arr,low,pindex-1);
		qs(arr,pindex+1,high);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
      
        qs(arr, 0, n - 1);
        
        for (int val : arr) {
            System.out.print(val + " ");  
	}
	}

}
