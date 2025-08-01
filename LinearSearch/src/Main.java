import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 29, 45, 1, 2, 3, 8, 9, -11, 29};
        int target = 2;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in the array: return the index if item found
    //otherwise if item not foun return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run for the loop
        for (int i = 0; i < arr.length; i++) {
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
