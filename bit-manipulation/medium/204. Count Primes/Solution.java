class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        
        BitSet isPrime = new BitSet(n);
        isPrime.set(2, n);

        for(int i = 2; i * i < n; i++){
            if(isPrime.get(i)){
                for(int j = i * i; j < n; j += i){
                    isPrime.clear(j);
                }
            }
        }

        return isPrime.cardinality();
    }
}
