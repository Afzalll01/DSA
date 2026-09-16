class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,max=Integer.MAX_VALUE,count=t.length(),start=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0) count--;
            }
            while(count==0){
                if(max>j-i+1){
                    max=j-i+1;
                    start=i;
                }
                char c=s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)>0) count++;
                }
                i++;
            }
        }
        if(max==Integer.MAX_VALUE) return "";
        return s.substring(start,start+max);
    }
}