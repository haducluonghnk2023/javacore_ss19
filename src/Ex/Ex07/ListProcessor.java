package Ex.Ex07;

import java.util.List;

public interface ListProcessor {
    boolean containsNegative(List<Integer> list);
    static void printList(List<Integer> list1){
        System.out.println(list1);
    };
}
