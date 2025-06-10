package problems;

public class ArrayLeader {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
	        int n = arr.length;
	        
	        int maxFromRight = arr[n - 1];
	        al.add(maxFromRight); 

	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] >= maxFromRight) {
	                maxFromRight = arr[i];
	                al.add(maxFromRight);
	            }
	        }
	        Collections.reverse(al);
	        System.out.print(al);;
	}

}
