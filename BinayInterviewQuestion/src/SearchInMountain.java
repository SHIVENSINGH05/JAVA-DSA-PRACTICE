public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int target = 4;
        System.out.println(search(arr, target)); // should return index of 4
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountain(arr);

        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // Search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in the decreasing part of the mountain
                end = mid;
            } else {
                // You are in the ascending part of the mountain
                start = mid + 1;
            }
        }
        // start == end will be the peak index
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

