package problems;
import java.util.*;
public class BinarySearchsqrt {
	    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      double num=sc.nextInt();
	      double e=1e-6;
	      double start=0;
	      double end=num;
	      if(num>0 && num<1) e=1;
	      while((end-start)>e)
	      {
	          double mid=(start+end)/2;
	          if(mid*mid >num)
	          {
	              end=mid;
	          }
	          else start=mid;
	      }
	      System.out.print((start+end)/2);
	    }
}
