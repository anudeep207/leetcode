class Solution {
    public void duplicateZeros(int[] arr) {
        int duplicateZeros = 0;
        int n = arr.length - 1;
        for (int i = 0; i <= n - duplicateZeros; i++) {
            if (arr[i] == 0) {
                if (i == n - duplicateZeros) {
                    arr[n] = 0;
                    n -= 1;
                    break;
                }
                duplicateZeros++;
            }
        }
        for (int j = n - duplicateZeros; j >= 0; j--) {
            if (arr[j] == 0) {
                arr[j+duplicateZeros] = arr[j];
                duplicateZeros--;
                arr[j+duplicateZeros] = arr[j];
            } else {
                arr[j+duplicateZeros] = arr[j];
            }
        }
    }
}