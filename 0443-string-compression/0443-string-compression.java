class Solution {
    public int compress(char[] chars) {
        int i=0;
        String s="";
        while(i<chars.length){
            int j=i;
            while(j<chars.length && chars[j]==chars[i]) j++;
            int count=j-i;
            s+=chars[i];
            if(count>1) s+=count;
            i=j;
        }
        for(int k=0;k<s.length();k++){
            chars[k]=s.charAt(k);
        }
        return s.length();
    }
}