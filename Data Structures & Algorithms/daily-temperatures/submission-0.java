class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            while( !st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
