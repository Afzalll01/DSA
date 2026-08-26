class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int count=0;
        String ans="";
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1') count++;
            while(count>k){
                if(s.charAt(i)=='1') count--;
                i++;
            }
            if(count==k){
                while(i<j && s.charAt(i)!='1') i++;
                String cur=s.substring(i,j+1);
                if(ans.equals("") || cur.length()<ans.length()){
                    ans=cur;
                }
                if(cur.length()==ans.length()){
                    if(cur.compareTo(ans)<0){
                        ans=cur;
                    }
                }


            }
        }
        return ans;
    }
}