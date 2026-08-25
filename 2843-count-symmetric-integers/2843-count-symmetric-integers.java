class Solution {
    public boolean check(String n){
        if(n.length()%2!=0) return false;
        int i=0;
        int j=n.length()-1;
        int sum1=0;
        int sum2=0;
        
        while(i<j){
            sum1+=n.charAt(i)-'a';
            i++;
            sum2+=n.charAt(j)-'a';
            j--;
        }
        if(sum1==sum2) return true;
        return false;

    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            if(check(s)) count++;
        }
        return count;
    }
}