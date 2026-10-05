class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int st=0;
        int end=0;
        int max=0;
        int ans=0;
        while(end!=s.length()){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            while(end-st+1-max>k){
                char c=s.charAt(st);
                map.put(c,map.get(c)-1);
                st++;
            }
            ans=Math.max(ans,end-st+1);
            end++;
        }
        return ans;
    }
}