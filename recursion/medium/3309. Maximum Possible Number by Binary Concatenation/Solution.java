class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] binaries = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            binaries[i] = Integer.toBinaryString(nums[i]);
        }
        
        List<List<String>> permutations = new ArrayList<>();
        permute(binaries, 0, permutations);
        
        int max = 0;
        
        for (List<String> permutation : permutations) {
            StringBuilder fullBinary = new StringBuilder();
            for (String binary : permutation) {
                fullBinary.append(binary);
            }
            int decimalValue = Integer.parseInt(fullBinary.toString(), 2);
            max = Math.max(max, decimalValue);
        }
        
        return max;
    }
    
    private void permute(String[] binaries, int index, List<List<String>> result) {
        if (index == binaries.length) {
            result.add(new ArrayList<>(Arrays.asList(binaries)));
        } else {
            for (int i = index; i < binaries.length; i++) {
                swap(binaries, i, index);
                permute(binaries, index + 1, result);
                swap(binaries, i, index); 
            }
        }
    }
    
    private void swap(String[] binaries, int i, int j) {
        String temp = binaries[i];
        binaries[i] = binaries[j];
        binaries[j] = temp;
    }
}
