class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (; k < n; ++k) {
            if (nums[k] > 0) {
                break;
            }
        }
        int i = k - 1;
        int j = 0;
        int[] res = new int[n];
        while(i >= 0 && k < n) {
            if (Math.abs(nums[i]) < nums[k]) {
                res[j++] = nums[i] * nums[i];
                i--;
            } else if (Math.abs(nums[i]) > nums[k]) {
                res[j++] = nums[k] * nums[k];
                k++;
            } else {
                res[j++] = nums[i] * nums[i];
                res[j++] = nums[i] * nums[i];
                i--;
                k++;
            }
        }
        while (i >= 0) {
            res[j++] = nums[i] * nums[i];
            i--;
        }
        while (k < n) {
            res[j++] = nums[k] * nums[k];
            k++;
        }
        return res;
    }
}