class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String ele=new String(arr);
            if(!map.containsKey(ele)){
                map.put(ele,new ArrayList<>());
            }
            map.get(ele).add(s);
        }
        return new ArrayList<>(map.values());

    }
}