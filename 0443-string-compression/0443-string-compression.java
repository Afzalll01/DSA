class Solution {
    public int compress(char[] chars) {
        int i=0;
        String s="";
        for(int j=1;j<chars.length;j++){
            if(chars[i]!=chars[j]){
                s+=chars[i];
                i=j;
            }
            else{
                while(j<chars.length && chars[j]==chars[i]){
                    j++;
                }
                s+=chars[i];
                s+=(j-i);
                i=j;
            }
        }
        if (i < chars.length) {
            s += chars[i];
        }
        for(int k=0;k<s.length();k++){
            chars[k]=s.charAt(k);
        }
        return s.length();
    }
}