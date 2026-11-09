class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
        int n=types.length;
        int[] stType=new int[n];
        int[] stColor=new int[n];
        int[] stCount=new int[n];
        int top=-1;
        for(int i=0;i<n;i++){
            int t=types[i];
            int c=colors[i];
            if(top>=0 && stType[top]==t && stColor[top]==c){
                stCount[top]++;
                if(stCount[top]==groupSize[t]){
                    top--;
                }
            }
            else{
                stType[++top]=t;
                stColor[top]=c;
                stCount[top]=1;
                if(stCount[top]==groupSize[t]){
                    top--;
                }
            }
        }
        return top==-1;
    }
}