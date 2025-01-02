import java.util.HashMap;

/*
Time COmplexity - > O(N)
Space Complexity -> O(N)
*/



class ContinguousArray {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        int rSum = 0;
        hashMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum--;
            }
            if (nums[i] == 1) {
                rSum++;
            }
            if (!hashMap.containsKey(rSum)) {
                hashMap.put(rSum, i);
            } else {
                max = Math.max(max, i - hashMap.get(rSum));
            }
        }
        return max;
    }
}