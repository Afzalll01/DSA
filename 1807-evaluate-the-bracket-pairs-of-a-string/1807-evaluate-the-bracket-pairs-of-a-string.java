class Solution {
    public String evaluate(String s, List<List<String>> k) {
        HashMap<String,String> map=new HashMap<>();
        String ans="";
        for(int i=0;i<k.size();i++){
            map.put(k.get(i).get(0),k.get(i).get(1));
        }
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=s.indexOf(')',i);
                String t=s.substring(i+1,j);
                ans+=map.getOrDefault(t,"?");
                i=j+1;
            }else{
                ans+=s.charAt(i);
                i++;
            }
        }
        return ans;
    }
}