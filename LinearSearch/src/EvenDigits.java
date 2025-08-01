import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
//        System.out.println(findNumbers(nums));
        System.out.println(digits(54637));
    }
    static int findNumbers(int n nums) {
        int count = 0;
        for (int num: nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contain eve digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;

    }
    static int digits(int num) {
        if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
