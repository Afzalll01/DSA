class Solution {
    static final int MOD = 1_000_000_007;
    public int numOfWays(int[] nums) {
        int n = nums.length;
        long[][] comb = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }
        return (int) ((helper(nums, comb) - 1 + MOD) % MOD);
    }
    private long helper(List<Integer> nums, long[][] comb) {
        int n = nums.size();
        if (n <= 2) return 1;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int root = nums.get(0);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < root) {
                left.add(nums.get(i));
            } else {
                right.add(nums.get(i));
            }
        }
        long ways = comb[n - 1][left.size()];
        ways = ways * helper(left, comb) % MOD;
        ways = ways * helper(right, comb) % MOD;
        return ways;
    }
    private long helper(int[] nums, long[][] comb){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        return helper(list, comb);
    }
}