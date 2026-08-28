class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,c);
            }else{
                if(map.get(ch)!=c) return false;
            }
            if(!map2.containsKey(c)){
                map2.put(c,ch);
            }
            else{
                if(map2.get(c)!=ch) return false;
            }
        }
        return true;
    }
}