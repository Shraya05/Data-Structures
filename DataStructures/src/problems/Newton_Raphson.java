package problems;
import java.util.*;
public class Newton_Raphson {
	
	    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      double num=sc.nextDouble();
	      double e=1e-6;
	     if(num<0) throw new IllegalArgumentException("Negative values are not allowed");
	     double guess=num;
	     while(Math.abs(guess*guess-num)>e)
	     {
	         guess=(guess+num/guess)/2;
	     }
	     System.out.print(guess);
	    }
}
