class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> mP=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,c);
            }
            else{
                if(map.get(ch)!=c) return false;
            }
            if(!mP.containsKey(c)){
                mP.put(c,ch);
            }
            else{
                if(mP.get(c)!=ch) return false;
            }
        }
        return true;
    }
}