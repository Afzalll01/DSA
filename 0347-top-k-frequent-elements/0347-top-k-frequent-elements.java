class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i=0;i<k;i++){
            int freq=-1;
            int el=-1;
            for(int ele:map.keySet()){
                if(map.get(ele)>freq){
                    freq=map.get(ele);
                    el=ele;
                }
            }
            arr[i]=el;
            map.remove(el);
        }
        return arr;

    }
}