import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

        list.add(67);
        list.add(45);
        list.add(653);
        list.add(451);
        list.add(672);
        list.add(452);
        list.add(653);
        list.add(451);
        list.add(671);

        list.add(653);
//        System.out.println(list.contains(67));
        System.out.println(list);
        list.set(0, 99);
        list.remove(3);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
        }

    }
}


