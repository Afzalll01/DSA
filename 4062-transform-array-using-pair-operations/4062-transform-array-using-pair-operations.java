class Solution {
    public boolean canTransform(int[] s, int[] t) {
        long sum=0;
        for(int ele:s) sum+=ele;
        long sum2=0;
        for(int ele:t) sum2+=ele;
        return (sum==sum2);
    }
}