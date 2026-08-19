class Solution {
    public boolean checkPerfectNumber(int num) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<num;i++){
            if(num%i==0) list.add(i);
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        if(sum==num) return true;
        return false;
    }
}