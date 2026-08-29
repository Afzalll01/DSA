class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int len=sb.length();
            char ch=s.charAt(i);
            if(len>0 && sb.charAt(len-1)==ch){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}