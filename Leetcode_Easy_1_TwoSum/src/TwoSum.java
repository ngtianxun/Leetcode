// Reference from: https://leetcode.com/problems/two-sum/discuss/3/Accepted-Java-O(n)-Solution

import java.util.HashMap;

public class TwoSum {
	
	/*
	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order. 

	Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	
	Example 2:
	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	
	Example 3:
	Input: nums = [3,3], target = 6
	Output: [0,1]
	
	Constraints:
	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.
	 */
	public static int[] twoSum(int[] nums, int target) {
		// Create new HashMap object
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		
		return new int[] {0, 0};
	}
	
	public static void main(String[] args) {
		// Test case
		int nums[] = {2, 7, 11, 7, 7};
		int target = 18;
		
		int results[] = new int[2];
		
		results = twoSum(nums, target);
		
		for (int i = 0; i < results.length; i++) {
			System.out.print(results[i] + " ");
		}
	}

}
