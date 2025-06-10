package problems;

public class Majority {
	 static int majorityElement(int arr[]) {
	        int max=Arrays.stream(arr).max().getAsInt();
	       int freq[]=new int[max+1];
	       for(int i=0;i<arr.length;i++)
	       {
	           freq[arr[i]]++;
	       }
	       for(int i=0;i<arr.length;i++)
	       {
	           if(freq[arr[i]] >arr.length/2) return arr[i];
	       }
	       return -1;
}
}