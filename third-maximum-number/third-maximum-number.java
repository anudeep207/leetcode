class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer num : set) {
            pq.add(num);
        }
        int maximum = pq.peek();
        int count = 0;
        int maxi3 = 0;
        while (!pq.isEmpty() && count < 3) {
            maxi3 = pq.peek();
            pq.remove();
            count++;
        }
        if (count != 3) {
            return maximum;
        }
        return maxi3;
    }
}