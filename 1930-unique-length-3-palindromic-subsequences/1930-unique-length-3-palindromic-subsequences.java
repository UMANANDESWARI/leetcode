import java.util.*;

public class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0;

        // Try each character as start and end of palindrome
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);

            // Check if there's room for a middle character
            if (last - first > 1) {
                Set<Character> middleChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    middleChars.add(s.charAt(i));
                }
                count += middleChars.size();
            }
        }

        return count;
    }
}

