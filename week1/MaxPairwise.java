import java.util.Scanner;

/** Given a String of n integers, find the maximum pairwise product.
    2 <= n <= 2 * 10^5
    0 <= a <= 10^5
 **/

class MaxPairwise {
    public static long maxPP(int[] nums) {
	long max1, max2; // Largest 2 Numbers, max1 > max2
	max1 = Math.max(nums[0],nums[1]);
	max2 = Math.min(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
	    if (nums[i] > max1) {
		max2 = max1;
		max1 = nums[i];
	    }
	    else if (nums[i] > max2) {
		max2 = nums[i];
	    }
	}
	return max1 * max2;
    }

    public static void main(String[] args) {
	int count; // # of inputs
	Scanner sc = new Scanner(System.in);
	count = sc.nextInt();

	// Array Generation
	int[] nums = new int[count]; // Array of inputs
	for (int i = 0; i < count; i++) { // Populate the array
	    nums[i] = sc.nextInt();
	}

	// Testing
	System.out.println(maxPP(nums)); // Product of 2 Largest 
	return;
    }
}
