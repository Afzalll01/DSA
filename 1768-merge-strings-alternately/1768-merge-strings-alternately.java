class Solution {
    public String mergeAlternately(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            sb.append(a.charAt(i));
            i++;
            sb.append(b.charAt(j));
            j++;
        }
        while(j<b.length()){
            sb.append(b.charAt(j++));
        }
        while(i<a.length()){
            sb.append(a.charAt(i++));
        }
        return sb.toString();
    }
}