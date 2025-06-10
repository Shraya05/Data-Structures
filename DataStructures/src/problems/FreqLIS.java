package problems;

import java.util.ArrayList;

public class FreqLIS {
	 int arr[]={0,3,1,2,2,1,4,2,5};
     int freq[]=new int[arr.length];
     for(int i=0;i<arr.length;i++)
     {
         freq[arr[i]]++;
     }
     int max=0;
     int ind=-1;
     for(int i=0;i<freq.length;i++)
     {
         if(freq[i]>max)
         {
             max=freq[i];
             ind=i;
         }
     }
     ArrayList<Integer> al=new ArrayList<>();
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==ind) continue;
         else if(freq[arr[i]]!=0) al.add(arr[i]);
     }
     System.out.print(al);
  int dp[]=new int[al.size()];
  Arrays.fill(dp,1);
  for(int i=1;i<al.size();i++)
  {
      for(int j=0;j<i;j++)
      {
          if(al.get(i)>al.get(j)) dp[i]=Math.max(dp[i],dp[j]+1);
      }
  }
  System.out.print(dp[al.size()-1]);
}
}
