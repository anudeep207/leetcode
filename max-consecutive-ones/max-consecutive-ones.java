class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxInt = 0;
        int count  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (count > maxInt) {
                    maxInt = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        if (maxInt < count) {
            maxInt = count;
        }
        return maxInt;
    }
}