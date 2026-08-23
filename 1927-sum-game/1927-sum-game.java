class Solution {
    public boolean sumGame(String num) {
        int rq=0;
        int lq=0;
        int r=0;
        int l=0;
        for(int i=0;i<num.length();i++){
            if(i<num.length()/2){
                if(num.charAt(i)=='?') lq++;
                else l+=num.charAt(i)-'0';
            }
            else{
                if(num.charAt(i)=='?') rq++;
                else r+=num.charAt(i)-'0';
            }
        }
        return (l-r)!=4.5*(rq-lq);
    }
}