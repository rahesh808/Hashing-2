import java.util.HashSet;

/*
Using hashSet 
timeComplexity -> O(N)
space complexity -> O(1)
*/

class LongestPalindrome_Solution1 {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> hashSet = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!hashSet.contains(ch)) {
                hashSet.add(ch);
            } else {
                counter = counter + 2;
                hashSet.remove(ch);
            }
        }
        if (!hashSet.isEmpty()) {
            counter++;
        }
        return counter;
    }
}