class Solution {
    public boolean judgeSquareSum(int c) {
        long lo=0;
        long hi=(long) Math.sqrt(c);
        while(lo<=hi){
            if ((lo*lo) + (hi*hi)==c) return true;
            else{
            if ((lo*lo) + (hi*hi)>c) hi--;
            else lo++;
           }
        }
        return false;      
    }
}