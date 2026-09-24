class Solution {
    public int hIndex(int[] c) {
        int lo=0;
        int hi=c.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int papers=c.length-mid;
            if(papers<=c[mid]) hi=mid-1;
            else lo=mid+1;
        }
        return c.length-lo;
    }
}