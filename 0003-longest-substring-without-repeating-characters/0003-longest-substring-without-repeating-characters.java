class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int max=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(!list.contains(ch)) list.add(ch);
            else{
                char c=s.charAt(i);
                while(s.charAt(i)!=ch){
                    list.remove((Character) s.charAt(i));
                    i++;
                }
                list.remove((Character) s.charAt(i));
                i++;
                list.add((Character) ch);
            }
            max=Math.max(j-i+1,max);
        }
        return max;
    }
}