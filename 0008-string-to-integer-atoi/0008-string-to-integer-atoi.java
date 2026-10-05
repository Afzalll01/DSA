class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int ans=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE -digit)/10){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10+digit;
            i++;
        }
        return ans*sign;
    }
}