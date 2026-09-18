class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int max=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(!list.contains(ch)){
                list.add(ch);
                max=Math.max(j-i+1,max);
            }
            else{
                list.remove((Character) s.charAt(i));
                i++;
                j--;
            }
        }
        return max;
    }
}