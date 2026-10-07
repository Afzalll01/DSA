class Solution {
    public int mostWordsFound(String[] nums) {
        int max=0;
        
        for(String s:nums){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') count++;
            }
            max=Math.max(max,count+1);
        }
        return max;
    }
}