class Solution {
    public boolean isSym(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
    public int compute(int a,int b,String s){
        int res = switch(s){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> a + b;
        };
        return res;
    }
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String s: tokens){
            if(isSym(s)){
                int a = st.pop(), b = st.pop();
                int c = compute(b,a,s); // flipped the a,b for b - a
                st.push(c);
            }else{
                int num = Integer.parseInt(s);
                st.push(num);
            }
        }
        return st.peek();
    }
}
