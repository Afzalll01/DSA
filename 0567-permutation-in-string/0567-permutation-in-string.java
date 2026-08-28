class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s2.length()<s1.length()) return false;
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=s1.length();
        for(int i=0;i<l;i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        int i=0;
        for(int j=l-1;j<s2.length();j++){
            if(map2.equals(map)) return true;
            if (j + 1 >= s2.length()) break;
            map2.put(s2.charAt(i),map2.get(s2.charAt(i))-1);
            if(map2.get(s2.charAt(i))==0) map2.remove(s2.charAt(i));
            i++;
            map2.put(s2.charAt(j+1),map2.getOrDefault(s2.charAt(j+1),0)+1);
        }
        return false;
    }
}