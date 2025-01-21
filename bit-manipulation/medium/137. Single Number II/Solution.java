class Solution {
    public int singleNumber(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;

        for (int num : arr) {
            xor1 = (xor1 ^ num) & ~xor2;
            xor2 = (xor2 ^ num) & ~xor1;
        }
        
        return xor1;
    }
}
