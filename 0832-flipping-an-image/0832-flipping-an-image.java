class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][col-1-j];
                image[i][col-1-j]=temp;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}