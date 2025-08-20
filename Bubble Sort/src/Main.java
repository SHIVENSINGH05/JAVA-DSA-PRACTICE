import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
//        bubble(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // fidn max item in remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n - 1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each step max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if current element is smaller than previous
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // array is already sorted
            }
        }
    }
}



