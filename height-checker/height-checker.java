class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int mismatch = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                mismatch++;
            }
        }
        return mismatch;
    }
}