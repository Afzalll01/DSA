class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int n = c.length;
        for(int i=0;i<n;i++){
            int paper = n-i;
            if(c[i]>=paper){
                return paper;
            }
        }
        return 0;
    }
}