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
// 	For example:
// 	AAAB
//	AAABA
//	BBAAA
	
	public static String longestCommonPrefix(String[] strs) {
        // Argument checks
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0, j = 0; i < first.length && j < last.length; i++, j++) {
            if (first[i] != last[j]) break;
            sb.append(first[i]);
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String strs[] = {"flo", "flow", "floght"};
		
		String results = longestCommonPrefix(strs);
		
		System.out.println("Result = " + results);
	}
}
