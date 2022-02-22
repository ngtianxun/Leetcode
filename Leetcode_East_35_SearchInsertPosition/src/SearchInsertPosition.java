// Referenced from: https://leetcode.com/problems/search-insert-position/discuss/15080/My-8-line-Java-solutionv

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
        // Using binary search
		int high, low, mid;
		
		low = 0;
		high = nums.length - 1;
		
		while (low <= high) {
			mid = (high + low) / 2;
			
			if (nums[mid] == target) {
				return mid;
			}
			
			if (nums[mid] > target) {
				high = mid - 1;
			}
			else
				low = mid + 1;
		}
		return low;
    }
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,6}; 
	    int target = 2;
	    int index;
	 
	    index = searchInsert(nums, target);
	}

}
