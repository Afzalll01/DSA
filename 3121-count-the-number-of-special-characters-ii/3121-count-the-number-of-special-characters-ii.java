class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!Character.isUpperCase(ch)) map.put(ch,i);
            else{
                if(!map.containsKey(ch)) map.put(ch,i);
            }
        }
        int count=0;
        for(char ch:map.keySet()){
            if(!Character.isUpperCase(ch)){
                char c=Character.toUpperCase(ch);
                if(map.containsKey(c) && map.get(ch)<map.get(c)) count++;
            }
        }
        return count;
    }
}