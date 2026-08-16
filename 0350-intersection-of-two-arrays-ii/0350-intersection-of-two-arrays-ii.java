class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> arr=new ArrayList<>();
                 Map<Integer,Integer> aMap=new HashMap<>();
                         Map<Integer,Integer> bMap=new HashMap<>();
                                 for(int ele:nums1){
                                             aMap.put(ele,aMap.getOrDefault(ele,0)+1);
                                                     }
                                                             for(int ele:nums2){
                                                                         if(aMap.containsKey(ele) && aMap.get(ele)>0) 
                                                                                     {
                                                                                                 arr.add(ele);
                                                                                                             aMap.put(ele,aMap.get(ele)-1);
                                                                                                                         }
                                                                                                                                 }
                                                                                                                                         int[] ans=new int[arr.size()];
                                                                                                                                                 for(int i=0;i<arr.size();i++){
                                                                                                                                                             ans[i]=arr.get(i);
                                                                                                                                                                     }
                                                                                                                                                                             return ans;
    }
}