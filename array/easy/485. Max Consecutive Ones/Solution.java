class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0,count = 0;
        for(int num : arr){
            if(num == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            } else{
                count = 0;
            }   
        }
        return maxCount;
    }
}
