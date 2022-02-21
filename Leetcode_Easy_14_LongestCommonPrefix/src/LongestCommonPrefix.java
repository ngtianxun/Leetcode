// Referenced from: https://leetcode.com/problems/longest-common-prefix/discuss/6924/Sorted-the-array-Java-solution-2-ms

import java.util.Arrays;


public class LongestCommonPrefix {
	
//	My answer:
//	public static String longestCommonPrefix(String[] strs) {
//		String prevPrefix, commonPrefix = "";
// 
//        for (int i = 0; i < strs[0].length(); i++) {
//        	prevPrefix = commonPrefix;
//        	commonPrefix += strs[0].charAt(i); 
//            
//        	for (int k = 0; k < strs.length; k++) {
//            	if (!strs[k].startsWith(commonPrefix)) {
//                	return prevPrefix;
//                }
//            }
//        }
//        return commonPrefix;
//    }
	
//	Using Array.sort to compare first and last (very different between the two since using dictionary arrangement)
	
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder commonPrefix = new StringBuilder();
		Arrays.sort(strs);
		
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length - 1].toCharArray();
		
		// Compare only the first and last since they are most different from each other.
		for (int i = 0; i < strs.length; i++) {
			if (first[i] == last[i]) {
				commonPrefix.append(first[i]);
			}
		}
		
		return commonPrefix.toString();
    }

	public static void main(String[] args) {
		String strs[] = {"flo", "fliw", "fooght"};
		
		String results = longestCommonPrefix(strs);
		
		System.out.println("Result = " + results);
	}
}
