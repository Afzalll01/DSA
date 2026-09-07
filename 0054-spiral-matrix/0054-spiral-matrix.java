class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        int tne=row*col;
        int fr=0,lr=row-1,fc=0,lc=col-1;
        while(list.size()<tne){
            for(int i=fc;i<=lc;i++){
                list.add(matrix[fr][i]);
            }
            fr++;
            if(list.size()==tne) break;
            for(int i=fr;i<=lr;i++){
                list.add(matrix[i][lc]);
            }
            lc--;
            if(list.size()==tne) break;
            for(int i=lc;i>=fc;i--){
                list.add(matrix[lr][i]);
            }
            lr--;
            if(list.size()==tne) break;
            for(int i=lr;i>=fr;i--){
                list.add(matrix[i][fc]);
            }
            fc++;
        }
        return list;
    }
}