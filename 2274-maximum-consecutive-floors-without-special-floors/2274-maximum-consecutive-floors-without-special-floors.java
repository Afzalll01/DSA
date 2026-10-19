class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans=0;
        for(int i=1;i<special.length;i++){
            ans=Math.max(ans,special[i]-special[i-1]-1);
        }
        ans=Math.max(ans,Math.max(special[0]-bottom,top-special[special.length-1]));
        return ans;
    }
}