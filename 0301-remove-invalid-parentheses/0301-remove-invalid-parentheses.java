class Solution {
    private void solve(String s, int i, int validCount, String str, int open, int close, List<String> ans, Set<String> set){
        if(open<close) return;
        if(i>=s.length()){
            if(str.length()==validCount && open==close){
                if(!set.contains(str)){
                    ans.add(str);
                    set.add(str);
                }
            }
            return;
        }

        char c = s.charAt(i);

        if(c=='('){
            solve(s, i+1, validCount, str+c, open+1, close, ans, set);
            solve(s, i+1, validCount, str, open, close, ans, set); 
        }
        else if(c==')'){
            solve(s, i+1, validCount, str+c, open, close+1, ans, set);
            solve(s, i+1, validCount, str, open, close, ans, set);
        }
        else solve(s, i+1, validCount, str+c, open, close, ans, set);
    }
    private int countMinimum(String s) {
        int balance = 0;
        int removeClose = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                balance++;
            } 
            else if (c == ')') {
                if (balance > 0) {
                    balance--;
                } 
                else {
                    removeClose++;
                }
            }
        }

        int removeOpen = balance;

        return s.length() - removeOpen - removeClose;
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();

        int validCount = countMinimum(s);

        solve(s, 0, validCount, "", 0, 0, ans, set);

        if(ans.size()==0) ans.add("");

        return ans;
    }
}