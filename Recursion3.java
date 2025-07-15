import java.util.*;

public class Recursion2 {

    public static void printSubset(ArrayList<ArrayList<Integer>> subset) {
        for (int i =-0; i < subset.size(); i++) {
            System.out.println(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n,ArrayList<Integer>subset) {
        if (n == 0) {
            printSubset(Subset);
            return;
        }

        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);
        //add nhi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> Subset = new ArrayList<>();
        findSubsets(n, Subset);
    }
}
