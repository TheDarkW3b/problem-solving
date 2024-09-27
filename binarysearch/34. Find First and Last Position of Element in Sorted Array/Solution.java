class Solution {
    public static int[] searchRange(int[] arr, int target) {
        int firstOccurrence = binarySearch(arr, target, false);
        int lastOccurrence = binarySearch(arr, target, true);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    private static int binarySearch(int[] arr, int target, boolean findLast){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start <= end){
            int mid = (start + end) >> 1;
            if(arr[mid] < target){
                start = mid + 1;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                index = mid;
                if(findLast)
                    start = mid + 1;
                else
                    end = mid -1;
            }
        }
        return index;
    }
}
