
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] != val) {
        		nums[count] = nums[i];
        		count++;
        	}
        }
        
        return count;
    }

	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3};
		int count, val = 2;
		
		count = removeElement(nums, val);
	}

}
