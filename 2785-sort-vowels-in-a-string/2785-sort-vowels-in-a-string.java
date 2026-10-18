class Solution {
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))) list.add(s.charAt(i));
        }
        Collections.sort(list);
        int j=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])) arr[i]=list.get(j++);
        }
        return new String(arr);
    }
}