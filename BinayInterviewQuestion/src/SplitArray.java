import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // binary search
        while (start < end) {
            //try for the middle as potential ans
            int mid = (start - end) / 2;
            // calcuate how many pieces u can divide thsi in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cant add this in this subarr, make new one
                    // say u can add this num in the new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return end; //here start == end
        }
    }

