class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        for(String s:word1){
            a+=s;
        }
        String b="";
        for(String s:word2){
            b+=s;
        }
        if(a.equals(b)) return true;
        return false;
        
    }
}