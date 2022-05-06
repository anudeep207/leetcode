class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> nums = new ArrayList<>();
        int i = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            nums.add(digit);
        }
        i = 0; int j = nums.size() - 1;
        while (i < j) {
            if (nums.get(i) != nums.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}