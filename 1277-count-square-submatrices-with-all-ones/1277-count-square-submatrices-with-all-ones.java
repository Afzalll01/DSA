class Solution {
    public int countSquares(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    if(i!=0 && j!=0){
                        mat[i][j]+=Math.min(mat[i-1][j-1],Math.min(mat[i-1][j],mat[i][j-1]));
                    }
                    count+=mat[i][j];
                }
            }
        }
        return count;
    }
}