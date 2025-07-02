public class Recursion3 {

    public static void printPrem(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            //"abc"->"ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPrem(newStr, permutation+currChar);
        }
    }
    public static void printPrem(String args[]) {
        String str = "abc";
        printPrem(str, "");
    }
}
