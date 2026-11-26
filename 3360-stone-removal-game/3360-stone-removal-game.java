class Solution {
    public boolean canAliceWin(int n) {
        int i=1;
        int p=10;
        while(n>=0){
            n=n-p;
            p--;
            i++;
        }
        if(i%2==0) return false;
        return true;
    }
}