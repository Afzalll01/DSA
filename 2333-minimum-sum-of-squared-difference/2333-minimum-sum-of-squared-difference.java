class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] freq = new int[100005];

        for (int i = 0; i < nums1.length; i++) {
            int val = Math.abs(nums1[i] - nums2[i]);
            freq[val]++;
        }

        long k = (long) k1 + k2;

        for (int i = freq.length - 1; i > 0 && k > 0; i--) {
            long countOps = Math.min((long) freq[i], k);

            freq[i] -= (int) countOps;
            freq[i - 1] += (int) countOps;

            k -= countOps;
        }

        long ans = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}