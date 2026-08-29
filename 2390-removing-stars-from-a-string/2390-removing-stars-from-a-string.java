class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&& sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }else if(s.charAt(i)=='*' && sb.length()==0) continue;
            else{
                sb.append(s.charAt(i));
            }  
        }
        return sb.toString();
    }
}