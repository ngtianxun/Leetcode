// Referenced from: https://leetcode.com/problems/implement-strstr/discuss/12807/Elegant-Java-solution

public class ImplementstrStr {
	
	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0)
        	return 0;
		
		if (haystack.length() == 0) 
        	return -1;
        
        for (int i = 0; i < haystack.length(); i++) {
        	if (i + needle.length() > haystack.length())
        		return -1;
        	for (int j = 0; j < needle.length(); j++) {
        		if (haystack.charAt(i + j) != needle.charAt(j))
        			break;
        		if (needle.length() - 1 == j)
        			return i;
        	}
        }
        return -1;
    }

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "hello";
		int index;
		
		index = strStr(haystack, needle);
	}

}
