class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int i=0;
        int t=0;
        int f=0;
        int max=0;
        for(int j=0;j<a.length();j++){
            char ch=a.charAt(j);
            if(ch=='T') t++;
            else f++;
            int changes=Math.min(f,t);
            while(changes>k){
                if(a.charAt(i)=='T') t--;
                else f--;
                changes=Math.min(f,t);
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}