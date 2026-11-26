class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=s.length();
        int i=0;
        int j=0;
        int max=0;
        while(j<l){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
                j++;
                max=Math.max(max,j-i);
            }else{
                map.remove(s.charAt(i++));
            }
        }
        return max;
    }
}