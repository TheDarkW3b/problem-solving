class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt((int[] a) -> a[0]));

        for (int i = 1; i < items.length; i++) {
            items[i][1] = Math.max(items[i][1], items[i - 1][1]);
        }
        
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = 0, end = items.length;
            int maxBeauty = 0;

            while (start < end) {
                int mid = start + end >> 1;
                
                if (items[mid][0] <= queries[i]) {
                    maxBeauty = Math.max(maxBeauty, items[mid][1]);
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

            ans[i] = maxBeauty;
        }

        return ans;
    }
}
