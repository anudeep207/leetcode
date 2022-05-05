class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int nod = getNumberOfDigits(nums[i]);
            count = nod % 2 == 0 ? count + 1 : count; 
        }
        return count;
    }
    
    public int getNumberOfDigits(int num) {
        
        int numberOfDigits = 0;
        while (num != 0) {
            numberOfDigits++;
            num = num / 10;
        }
        return numberOfDigits;
    }
}