class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0, j = 1;

        for(int num : arr){
            if(num > 0){
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }
        return ans; 
    }
}
