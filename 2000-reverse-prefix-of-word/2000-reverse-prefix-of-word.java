class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        if(i==-1) return word;
        String c=word.substring(0,i+1);
        StringBuilder sb=new StringBuilder(c);
        String f=sb.reverse().toString();
        String d=word.substring(i+1);
        return f+d;
    }
}