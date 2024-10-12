class Solution {
    public int[] minBitwiseArray(List<Integer> arr) {
        int[] ans = new int[arr.size()];
        int index = 0;

        for (int num : arr) {
            int minimalValue = Integer.MAX_VALUE;
            boolean isValid = false;

            for (int bitPosition = 0; bitPosition <= 30; bitPosition++) {
                if ((num & (1 << bitPosition)) != 0) {
                    int candidate = num & ~(1 << bitPosition);
                    if (candidate >= 0 && (candidate | (candidate + 1)) == num) {
                        if (candidate < minimalValue) {
                            minimalValue = candidate;
                            isValid = true;
                        }
                    }
                }
            }
            ans[index++] = isValid ? minimalValue : -1;
        }
        
        return ans;
    }
}
