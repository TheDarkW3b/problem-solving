class Solution {
    public int countMaxOrSubsets(int[] arr) {
        int count = 0;

        int maxOr = 0;
        for(int num : arr) maxOr |= num;

        int n = arr.length;
        int totalSubsets = 1 << n;

        for(int i = 0; i < totalSubsets; i++){
            int orSum = 0;
            for(int j = 0 ; j < n; j++){
                if((i & (1 << j)) != 0){
                    orSum |= arr[j];
                }
            }

            if(orSum == maxOr) count++;
        }

        return count;
    }
}
