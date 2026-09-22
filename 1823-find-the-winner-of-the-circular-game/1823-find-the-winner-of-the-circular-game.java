class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        int j=1;
        while(j!=n+1){
            q.add(j++);
        }
        while(q.size()!=1){
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.remove();
    }
}