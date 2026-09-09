class Solution {
    public long countCommas(long n) {
        long ans =0;
        for(long i=1000;i<=n;i*=1000){
            ans+=n-i+1;
        }
        return ans;

    }
}