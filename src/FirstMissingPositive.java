// Given an unsorted integer array, find the first missing positive integer.
//
// For example,
// Given [1,2,0] return 3,
// and [3,4,-1,1] return 2.
// and [0,-1,3] return 1
//
// Your algorithm should run in O(n) time and uses constant space.


public class FirstMissingPositive {

	public static int firstMissingPositive(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			while ((nums[i] <= nums.length) && (nums[i] > 0) && (nums[i] != nums[nums[i] - 1])) {
				int swapTemp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = swapTemp;
			}

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}

		return nums.length + 1;
	}

}
