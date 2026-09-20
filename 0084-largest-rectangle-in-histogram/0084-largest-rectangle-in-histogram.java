class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[]nse=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        int[]pse=new int[n];
        Stack<Integer> st1=new Stack<>();
        st1.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(st1.size()>0 && arr[st1.peek()]>=arr[i]) st1.pop();
            if(st1.size()==0) pse[i]=-1;
            else pse[i]=st1.peek();
            st1.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int sum=arr[i] * (nse[i]-pse[i]-1);
            max=Math.max(sum,max);
        }
        return max;

    }
}