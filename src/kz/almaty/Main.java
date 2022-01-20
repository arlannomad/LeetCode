package kz.almaty;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
     static class Solution {
        public int romanToInt(String s) {
            int result = 0;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            hashMap.put('I', 1);
            hashMap.put('V', 5);
            hashMap.put('X', 10);
            hashMap.put('L', 50);
            hashMap.put('C', 100);
            hashMap.put('D', 500);
            hashMap.put('M', 1000);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                    if (i > 0 && s.charAt(i - 1) == 'I') result = result - 2;
                }
                if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                    if (i > 0 && s.charAt(i - 1) == 'X') result = result - 20;
                }
                if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                    if (i > 0 && s.charAt(i - 1) == 'C') result = result - 200;
                }
                result = result + hashMap.get(s.charAt(i));
            }
            return result;
        }
    }
}
