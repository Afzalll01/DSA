class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder(num);
        while(sb.length()!=0){
            int i=sb.length()-1;
            int number=sb.charAt(i);
            if(number%2!=0) return sb.toString();
            sb.deleteCharAt(i);
        }
        return "";
    }
}