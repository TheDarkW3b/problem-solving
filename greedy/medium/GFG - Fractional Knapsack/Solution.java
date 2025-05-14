class Solution {
    private class Item {
        private int w;
        private int v;
        private double ratio;
        
        public Item(int w, int v, double ratio) {
            this.w = w;
            this.v = v;
            this.ratio = ratio;
        }
    }
    
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] vwRatio = new Item[n];
        
        for (int i = 0; i < n; i++) {
            vwRatio[i] = new Item(weights[i], values[i], (double) values[i] / weights[i]);
        }
        
        Arrays.sort(vwRatio, Comparator.comparingDouble((Item a) -> a.ratio).reversed());
        
        double profit = 0.0;
        for (int i = 0; i < n; i++) {
            Item item = vwRatio[i];
            
            if (W - item.w >= 0) {
                W -= item.w;
                profit += item.v;
            } else {
                profit += ((double) item.v / item.w) * W;
                break;
            }
        }
        
        return profit;
    }
}
