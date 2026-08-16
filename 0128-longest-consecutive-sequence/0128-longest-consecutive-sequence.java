class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int ele:nums){
            arr.add(ele);
        }
        int max=0;
        for(int ele:arr){
            if(!arr.contains(ele-1)){
                int i=ele;
                int count=1;
                while(arr.contains(i+1)){
                    i+=1;
                    count+=1;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}