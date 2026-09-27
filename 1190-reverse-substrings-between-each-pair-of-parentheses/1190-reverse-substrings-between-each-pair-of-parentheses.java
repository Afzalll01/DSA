class Solution {
    public String reverseParentheses(String s) {
        while(s.contains("(")){
            int j=s.indexOf(")");
            int i=s.lastIndexOf("(",j);
            String t=s.substring(i+1,j);
            t=new StringBuilder(t).reverse().toString();
            s=s.substring(0,i)+t+s.substring(j+1);
        }
        return s;
    }
}