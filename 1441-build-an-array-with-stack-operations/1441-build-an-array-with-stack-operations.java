class Solution {
    public List<String> buildArray(int[] target, int t) {
        List<String> list=new ArrayList<>();
        int n=target.length;
        int j=1;
        for(int i=0;i<n;i++){
            while(target[i]!=j){
                list.add("Push");
                list.add("Pop");
                j++;
            }
            list.add("Push");
            j++;
        }
        return list;
    }
}