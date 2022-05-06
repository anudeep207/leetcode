class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = (nums[i] < 0 ? -nums[i] : nums[i]) - 1;
            nums[idx] = nums[idx] < 0 ? nums[idx] : -nums[idx];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }     
        return result;
    }
}