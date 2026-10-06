class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            while(i-j+1-max>k){
                char c=s.charAt(j);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}