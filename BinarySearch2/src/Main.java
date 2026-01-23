public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ans = binarySearch(arr,10);
        System.out.println(ans);
    }
    //return the index
    //return - 1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) /2// might be possible that this value can exceed in java when u take bigger value
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}