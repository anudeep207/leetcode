class Solution {
    public int removeElement(int[] nums, int val) {
        int[] dup = nums.clone();
        int count = 0;
        int k = 0;
        for (int i = 0; i < dup.length; i++) {
            if (dup[i] == val) {
                continue;
            }
            nums[k++] = dup[i];
            count++;
        }
        return count;
    }
}