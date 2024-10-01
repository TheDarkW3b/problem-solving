class Solution {
    public int longestOnes(int[] arr, int k) {
        int l = 0, r = 0;
        int maxLen = 0;

        int size = arr.length;
        int zeroesCount = 0;

        while(r < size){
            if(arr[r] == 0) zeroesCount++;

            while(zeroesCount > k){
                int value = arr[l++];
                if(value == 0) zeroesCount--;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
