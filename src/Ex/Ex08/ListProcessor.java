package Ex.Ex08;

import java.util.List;
import java.util.function.Predicate;

public interface ListProcessor {
    int sumOddNumbers(List<Integer> list);
    static void printList(List<Integer> list){
        System.out.println(list);
    }
    default boolean checkOdd(List<Integer> list){
        for (Integer integer : list) {
            if (integer % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
