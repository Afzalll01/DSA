class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(char ch:s.toCharArray()) freq[ch]++;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>=1;i--){
            for(int count=0;count<128;count++){
                if(freq[count]==i){
                    for(int j=0;j<i;j++){
                        sb.append((char)count);
                    }
                }
            }
        }
        return sb.toString();
    }
}