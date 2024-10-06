class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;

        int count = 0;
        int i = 0, j = 1;
        while(j < arr.length){
            while(j < arr.length && arr[i] == arr[j]){
                j++;
            }
            if(j < arr.length){
                swap(arr,i+1,j);
                count++;
                i++;
                j++;
            }
        }
        return count+1;
    }

    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
