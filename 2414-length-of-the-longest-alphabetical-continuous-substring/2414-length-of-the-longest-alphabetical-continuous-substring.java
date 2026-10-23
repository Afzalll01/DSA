class Solution {
    public int longestContinuousSubstring(String s) {
        int count=0;
        int max=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)!=1){
                max=Math.max(count+1,max);
                count=0;
            }else{
                count++;
            }
        }
        max=Math.max(count+1,max);
        return max;
    }
}