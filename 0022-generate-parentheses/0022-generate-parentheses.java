class Solution {
    public List<String> generate(int n,int l,int r,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return ans;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
        return ans;
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        return generate(n,0,0,"",ans);
    }
}