import java.util.ArrayList;
import java.util.List;

class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            } 
        }

        //just find missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }
        return missingNumbers;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


