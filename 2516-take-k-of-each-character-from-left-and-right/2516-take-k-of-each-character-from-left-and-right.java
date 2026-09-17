class Solution {
    public int takeCharacters(String s, int k) {
        int a=0;
        int b=0;
        int c=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else c++;
        }
        if(a<k || b<k || c<k) return -1;
        int maxA=a-k;
        int maxB=b-k;
        int maxC=c-k;

        int ca=0;
        int cb=0;
        int cc=0; 
        int maxLen=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='a') ca++;
            else if(ch=='b') cb++;
            else cc++;
            while(ca>maxA || cb>maxB || cc>maxC){
                char chh=s.charAt(i);
                if(chh=='a') ca--;
                else if(chh=='b') cb--;
                else cc--;
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return(s.length()-maxLen);

    }
}