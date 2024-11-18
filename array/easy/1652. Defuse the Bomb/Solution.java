class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        
        if (k == 0) return ans;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += arr[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= Math.abs(k); j++) {
                    sum += arr[(i - j + n) % n];
                }
            }
            
            ans[i] = sum;
        }

        return ans;
    }
}
