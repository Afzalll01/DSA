class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr=t.toCharArray();
        char[] nums=s.toCharArray();
        for(char ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int i=0,j=0,max=Integer.MAX_VALUE,start=0,count=arr.length;
        while(j<nums.length){
            if(map.containsKey(nums[j])){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])>=0) count--;
            }
            while(count==0){
                if(max>j-i+1){
                    max=j-i+1;
                    start=i;
                }
                char left=nums[i];
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0) count++;
                }
                i++;
            }
            j++;
        }
        if(max==Integer.MAX_VALUE) return "";
        return s.substring(start,start+max);
    }
}