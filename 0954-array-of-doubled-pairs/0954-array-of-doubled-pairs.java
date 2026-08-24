class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])) {
                    continue;
            }
            if(arr[i]>0){
                if(!map.containsKey(2*arr[i])) return false;
                else{
                    map.put(arr[i],map.get(arr[i])-1);
                    map.put(2*arr[i],map.get(2*arr[i])-1);
                    if(map.get(arr[i])==0) map.remove(arr[i]);
                    if(map.get(2*arr[i])==0) map.remove(2*arr[i]);
                }
            }
            else if(arr[i]<0){
                if(arr[i]%2!=0 || !map.containsKey(arr[i]/2)) return false;
                else{
                    map.put(arr[i],map.get(arr[i])-1);
                    map.put(arr[i]/2,map.get(arr[i]/2)-1);
                    if(map.get(arr[i])==0) map.remove(arr[i]);
                    if(map.get(arr[i]/2)==0) map.remove(arr[i]/2);
                }
                
            }
            else{
                if(map.get(0)<2) return false;
                else{
                    map.put(0,map.get(0)-2);
                    if(map.get(0)==0) map.remove(0);
                }
            }
        }
        return true;
    }
}