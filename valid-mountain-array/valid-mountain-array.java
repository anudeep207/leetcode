class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0; int j = 1;
        int countLeft = 0; int countRight = 0;
        for(; i < arr.length && j < arr.length; i++, j++) {
            if (arr[j] < arr[i]) {
                break;
            } else if (arr[i] == arr[j]) {
                return false;
            }
            countLeft++;
        }
        for (; i < arr.length && j < arr.length; i++, j++) {
            if (arr[j] >= arr[i]) {
                return false;
            }
            countRight++;
        }
        if (countLeft == 0 || countRight == 0) {
            return false;
        }
        return true;
    }
}