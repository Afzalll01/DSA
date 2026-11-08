class Solution {
    public long countValidSubstrings(String s) {
        long ans=0;
        int lastA=-1;
        int lastAB=-1;
        int lastBad=-1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                lastA=i;
            }
            else if(ch=='b'){
                if(lastA!=-1){
                    lastAB=lastA;
                }
            }
            else if(ch=='c'){
                if(lastAB!=-1){
                    lastBad=Math.max(lastBad,lastAB);
                }
            }
            ans+=i-lastBad;
        }
        return ans;
    }
}