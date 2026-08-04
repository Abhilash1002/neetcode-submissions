class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        // System.out.println(sb.reverse().toString());
        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();
        return cleaned.equals(reversed);
    }
}
