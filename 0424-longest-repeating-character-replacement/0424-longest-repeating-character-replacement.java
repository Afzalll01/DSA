class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int max=0;
        int ans=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));

            while(j-i+1-max>k){
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}