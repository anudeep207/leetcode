class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int maxi = arr[n];
        arr[n] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxi;
            maxi = maxi < current ? current : maxi;
        }
        return arr;
    }
}