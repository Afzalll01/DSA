class Solution {
    public int dS(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] idx=new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(i,j) ->{
            int a=dS(nums[i]);
            int b=dS(nums[j]);
            if(a!=b) return Integer.compare(a,b);
            return Integer.compare(nums[i],nums[j]);
        });
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            pos[idx[i]]=i;
        }
        boolean[] seen=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(seen[i] || pos[i]==i) continue;
            int cycleSize=0;
            int j=i;
            while(!seen[j]){
                seen[j]=true;
                j=pos[j];
                cycleSize++;
            }
            count+=cycleSize-1;
        }
        return count;
    }
}