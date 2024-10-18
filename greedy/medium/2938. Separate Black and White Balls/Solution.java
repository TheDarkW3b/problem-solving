class Solution {
    public long minimumSteps(String s) {
        int whiteBallCount = 0;
        long totalSwaps = 0;

        for(char ch : s.toCharArray()){
            if(ch == '1')
                whiteBallCount++;
            else
                totalSwaps += whiteBallCount;
        }

        return totalSwaps;
    }
}
