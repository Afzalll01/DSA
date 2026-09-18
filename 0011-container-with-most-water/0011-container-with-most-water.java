class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            int width=j-i;
            int curH=Math.min(arr[i],arr[j]);
            int area=width*curH;
            ans=Math.max(area,ans);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return ans;
    }
}