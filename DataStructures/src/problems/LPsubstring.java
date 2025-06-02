package problems;

public class LPsubstring {
	public static void main(String[] args) {
	       String s="aaaabbaa";
	       int n=s.length();
	       int dp[][]=new int[n][n];
	      for(int i=0;i<n;i++)
	      {
	          dp[i][i]=1;
	      }
	      int start=0;
	      int maxlen=1;
	      for(int i=0;i<n-1;i++)
	      {
	          if(s.charAt(i)==s.charAt(i+1)) 
	          {dp[i][i+1]=1;
	          start=i;
	          maxlen=2;
	          }
	      }
	      for(int len=3;len<=n;len++)
	      {
	          for(int i=0;i<=n-len;i++)
	          {
	              int j=i+len-1;
	              if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1)
	              {
	                  dp[i][j]=1;
	                  start=i;
	                  if(len>maxlen)
	                  {
	                      maxlen=len;
	                      start=i;
	                  }
	              }
	          }
	      }
	      System.out.print(s.substring(start,start+maxlen));
	}
}
