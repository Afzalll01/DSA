class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> aMap=new HashMap<>();
        Map<Integer,Integer> bMap=new HashMap<>();
        for(int ele:nums1){
            aMap.put(ele,aMap.getOrDefault(ele,0)+1);
        }
        for(int ele:nums2){
            if(aMap.containsKey(ele)) 
            {
            arr.add(ele);
            aMap.remove(ele);
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}