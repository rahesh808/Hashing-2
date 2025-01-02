import java.util.HashMap;


/*
Using HashMap
Time Complexity -> O(N)
Space Complexity -> O(1)
*/
class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);

            }else {
                counter = counter + 2;
                hashMap.remove(ch);
            }

        }
        if(!hashMap.isEmpty()) {
            counter++;
        }

        return counter;
    }
}