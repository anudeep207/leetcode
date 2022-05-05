class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int requiredNum = target - nums[i];
            if (map.containsKey(requiredNum)) {
                sol[0] = map.get(requiredNum);
                sol[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        
        return sol;
    }
}