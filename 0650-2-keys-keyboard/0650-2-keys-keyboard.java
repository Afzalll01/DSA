class Solution {
    public int minSteps(int n) {
        return helper(1, 0, n);
    }
    public int helper(int curr, int copy, int n) {
        if (curr == n) return 0;
        if (curr > n) return 10000;
        int ans = 10000;
        if (copy != curr) {
            ans = Math.min(ans, 1 + helper(curr, curr, n));
        }
        if (copy > 0) {
            ans = Math.min(ans, 1 + helper(curr + copy, copy, n));
        }
        return ans;
    }
}
