class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
                j++;
            }
            else{
                max=Math.max(max,j-i);
                while(s.charAt(i)!=s.charAt(j)){
                    map.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        max=Math.max(max,j-i);
        return max;
    }
}