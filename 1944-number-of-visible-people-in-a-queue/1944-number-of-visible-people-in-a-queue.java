class Solution {
    public int[] canSeePersonsCount(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(st.size()>0 && nums[i]>st.peek()){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;
            arr[i]=count;
            st.push(nums[i]);
        }
        return arr;
    }
}