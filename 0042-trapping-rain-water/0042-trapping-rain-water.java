class Solution {
    public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int i=0;
        int j=height.length-1;
        int leftMax=0;
        int riMax=0;
        int max=0;
        while(i<j){
            if(height[i]<height[j]){
                leftMax=Math.max(leftMax,height[i]);
                max+=leftMax-height[i];
                i++;
            }
            else{
                riMax=Math.max(riMax,height[j]);
                max+=riMax-height[j];
                j--;
            }
        }
        return max;
    }
}