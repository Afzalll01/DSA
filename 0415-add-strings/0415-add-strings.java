class Solution {
    public String addStrings(String a, String b) {
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        String ans="";
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        while(i>=0 && j>=0){
            int sum=carry;
            sum+=arr1[i]-'0';
            sum+=arr2[j]-'0';
            ans+=sum%10;
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum=carry;
            sum+=arr1[i]-'0';
            ans+=sum%10;
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=carry;
            sum+=arr2[j]-'0';
            ans+=sum%10;
            carry=sum/10; 
            j--;
        }
        if(carry!=0) ans+=carry;
        StringBuilder sb=new StringBuilder(ans);
        return sb.reverse().toString();
    }
}