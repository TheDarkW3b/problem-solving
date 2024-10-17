class Solution {
    public double myPow(double base, long power) {
        if(power == 0) return 1.0;

        double result = 1.0;

        if(power < 0){
            base = 1 / base;
            power = Math.abs(power); 
        }

        while(power > 0){
            if((power & 1) == 1){
                result *= base;
            }

            base *= base;
            power >>= 1;
        }

        return result;
    }
}
