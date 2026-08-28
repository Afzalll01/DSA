class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        int i=0;
        String res="";
        while(i<f.length() && i<l.length() && f.charAt(i)==l.charAt(i)) i++;
        for(int j=0;j<i;j++){
            res+=f.charAt(j);
        }
        return res;
    }
}