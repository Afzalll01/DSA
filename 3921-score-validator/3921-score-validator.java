class Solution {
    public int[] scoreValidator(String[] nums) {
        int[] ans=new int[2];
        ans[0]=0;
        ans[1]=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i].equals("W")){
                ans[1]++;
                if(ans[1]==10) return ans;
            }
            else if(nums[i].equals("NB")) ans[0]++;
            else if(nums[i].equals("WD")) ans[0]++;
            else{
                int num=Integer.parseInt(nums[i]);
                ans[0]=ans[0]+num;
            }
        }
        return ans;
    }
}