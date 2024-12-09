package Arrays;

public class TwoPointers {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2, 3, 4, 4, 5}; // Input must be sorted for this approach
        int length = removeDuplicates(array);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; 
                nums[i] = nums[j]; 
            }
        }
        return i + 1;
	}

}
