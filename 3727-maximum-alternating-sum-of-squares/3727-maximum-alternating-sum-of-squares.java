class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] a = new long[nums.length];
        for (int i = 0; i < nums.length; i++) a[i] = (long) nums[i] * nums[i];

        Arrays.sort(a);

        long ans = 0;
        int k = nums.length / 2; 

        for (int i = 0; i < k; i++) ans -= a[i];

        for (int i = k; i < nums.length; i++) ans += a[i];

        return ans;
    }
}