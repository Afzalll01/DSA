class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push('(');
            else{
                if(st.size()>0){
                    st.pop();
                }
                else{
                    st2.push(')');
                }
            } 
        }
        return st.size()+st2.size();
    }
}