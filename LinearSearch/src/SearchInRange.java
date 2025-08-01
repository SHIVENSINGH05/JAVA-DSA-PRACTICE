import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1, 4));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        //run for the loop
        for (int i = start; i <= end; i++) {
            //chexk the element at every index if its is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        //this line will execute if the name of the return statements above have executed
        //hence target not found
        return -1;
    }
}

