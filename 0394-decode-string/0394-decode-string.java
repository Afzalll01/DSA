class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                counts.push(num);
                st.push(ch);
                num = 0;
            }
            else if(ch==']'){
                StringBuilder sb2 = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb2.append(st.pop());
                }
                st.pop();
                sb2.reverse();
                int repeat=counts.pop();
                for(int j=0;j<repeat;j++){
                    for(int k=0;k<sb2.length();k++){
                        st.push(sb2.charAt(k));
                    }
                }
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
