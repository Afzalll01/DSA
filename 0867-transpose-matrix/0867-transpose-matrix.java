class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int[][] arr=new int[col][rows];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;

    }
}