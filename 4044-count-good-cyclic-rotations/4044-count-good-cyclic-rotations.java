class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;

        long left = 0;
        long right = 0;
        for (int i = 0; i < n / 2; i++) {
            left += nums[i];
        }
        for (int i = n / 2; i < n; i++) {
            right += nums[i];
        }
        int count = 0;
        if (left > right) {
            count++;
        }
        for (int i = 0; i < n - 1; i++) {
            int first = nums[i];
            int second = nums[(i + n / 2) % n];
            left = left - first + second;
            right = right - second + first;
            if (left > right) {
                count++;
            }
        }
        return count;
    }
}