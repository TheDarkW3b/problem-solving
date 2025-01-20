class Solution {
    public int[] singleNumber(int[] arr) {
        int[] result = new int[2];

        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int rightMost = (xor & (xor - 1)) ^ xor;
        
        int bucket1 = 0, bucket2 = 0;

        for (int num : arr) {
            if ((num & rightMost) != 0) {
                bucket1 ^= num;
            } else {
                bucket2 ^= num;
            }
        }

        result[0] = bucket1;
        result[1] = bucket2;

        return result;
    }
}
