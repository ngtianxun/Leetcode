// Referenced from: https://leetcode.com/problems/roman-to-integer/discuss/6509/7ms-solution-in-Java.-easy-to-understand

import java.util.HashMap; 

public class RomantoInteger {
	
	public static int romanToInt(String s) { 
        int total = 0;
        
        // Mappings
        HashMap<String, Integer> mapping = new HashMap<String, Integer>();
        
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);
        
        // Traverse through every character
        for (int i = 0; i < s.length(); i++) {
            
            // If last element
            if (i == s.length() - 1) {
            	total += mapping.get(Character.toString(s.charAt(i)));
            	
            	return total;
            }
                
            // If current element is less than next element, substract
            if (mapping.get(Character.toString(s.charAt(i))) < mapping.get(Character.toString(s.charAt(i + 1)))) {
               total += mapping.get(Character.toString(s.charAt(i + 1))) - mapping.get(Character.toString(s.charAt(i)));
                                     
                i++; 
            }
            else {
                total += mapping.get(Character.toString(s.charAt(i)));
            }
        }
        return total;
    }

	public static void main(String[] args) {
		// Test inputs
		String s = "XIII";
		
		System.out.println("Integer = " + romanToInt(s));
	}

}
