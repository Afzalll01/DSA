class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'&& sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }else if(s.charAt(i)=='#' && sb.length()==0) continue;
            else{
                sb.append(s.charAt(i));
            }  
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && sb2.length()>0){
                sb2.deleteCharAt(sb2.length()-1);
            }
            else if(t.charAt(i)=='#' && sb2.length()==0) continue;
            else{
                sb2.append(t.charAt(i));
            }
        }
        if(sb.compareTo(sb2)==0) return true;
        return false;
    }
}