class Solution {
    public boolean canJump(int[] arr) {
        int len = arr.length;
        int maxIndexReached = 0;

        for(int i = 0; i < len; i++){
            if(i > maxIndexReached) return false;

            maxIndexReached = Math.max(maxIndexReached, i + arr[i]);

            if(maxIndexReached >= len) return true;
        }

        return true;
    }
}
