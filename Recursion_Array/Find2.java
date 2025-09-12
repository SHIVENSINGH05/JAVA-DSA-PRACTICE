import java.util.ArrayList;

public class Find2  {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 2, 8};
        int target = 2;

        // Example usage
        // System.out.println(find(arr, target, 0)); // true
        // System.out.println(findIndex(arr, target, 0)); // 0
        // System.out.println(findIndexLast(arr, target, arr.length - 1)); // 5

        // ArrayList<Integer> ans = findAllIndex(arr, target, 0, new ArrayList<>());
        // System.out.println(ans); // [0, 5]

        System.out.println(findAllIndex2(arr, target, 0)); // [0, 5]
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
