import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maxWealth(int[][] accounts) {
        //person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

}
