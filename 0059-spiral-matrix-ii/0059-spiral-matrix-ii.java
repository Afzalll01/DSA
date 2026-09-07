class Solution {
    public int[][] generateMatrix(int n) {
        int row=n;
        int col=n;
        int[][] arr=new int[n][n];
        int tne=row*col;
        int fr=0,lr=row-1,fc=0,lc=col-1;
        int j=1;
        while(j<=tne){
            for(int i=fc;i<=lc;i++){
                arr[fr][i]=j++;
            }
            fr++;
            for(int i=fr;i<=lr;i++){
                arr[i][lc]=j++;
            }
            lc--;
            for(int i=lc;i>=fc;i--){
                arr[lr][i]=j++;
            }
            lr--;
            for(int i=lr;i>=fr;i--){
                arr[i][fc]=j++;
            }
            fc++;
        }
        return arr;
    }
}