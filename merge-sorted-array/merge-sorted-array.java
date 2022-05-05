class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m];
        res = nums1.clone();
        int i = 0; int j = 0; int k = 0;
        while (i < m && j < n) {
            if (res[i] < nums2[j]) {
                nums1[k++] = res[i];
                i++;
            } else if (res[i] > nums2[j]) {
                nums1[k++] = nums2[j];
                j++;
            } else {
                nums1[k++] = res[i];
                nums1[k++] = res[i];
                i++;
                j++;
            }
        }
        while(i < m) {
            nums1[k++] = res[i++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}