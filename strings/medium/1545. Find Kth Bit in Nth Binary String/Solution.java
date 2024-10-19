class Solution {
    public StringBuilder reverse(StringBuilder s){
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char ch = s.charAt(start) == '0' ? '1' : '0';
            s.setCharAt(start, (s.charAt(end) == '0' ? '1' : '0'));
            s.setCharAt(end, ch);
            start++;
            end--;
        }

        return s;
    }

    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        StringBuilder past = new StringBuilder("0");

        for(int i = 1; i < n; i++){
            s.setLength(0);
            s.append(past).append("1").append(reverse(past));
            past.setLength(0);
            past.append(s);
        }

        return s.charAt(k - 1);
    }
}
