package Ex;

import java.util.*;
import java.util.function.Predicate;

public class Ex01 {
    public static void main(String[] args) {
        String[] arr = {"Java", "", "Lambda", "Stream", "", "Functional"};
        Predicate<String> isNotEmpty = e -> !e.isEmpty();
        for (String str : arr) {
            if (isNotEmpty.test(str)) {
                System.out.println(str);
            }
        }
    }
}
