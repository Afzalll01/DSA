class Solution {
    public String compressedString(String word) {
        String comp="";
        int i=0;
        while(i<word.length()){
            int j=i;
            while(j<word.length() && j-i<9 && word.charAt(j)==word.charAt(i)) j++;
            comp+=(j-i);
            comp+=word.charAt(i);
            i=j;
        }
        return comp;
    }
}