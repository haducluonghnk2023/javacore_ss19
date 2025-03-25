package Ex.Ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListProcessorImpl listProcessorImpl = new ListProcessorImpl();
        List<Integer> list1 = Arrays.asList(1,2,3,-4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        System.out.println("ds 1");
        ListProcessor.printList(list1);
        if (listProcessorImpl.containsNegative(list1)) {
            System.out.println("ds 1 chua so am");
        }else {
            System.out.println("ds 1 khong chua so am");
        }

        System.out.println("ds 2:");
        ListProcessor.printList(list2);
        if (listProcessorImpl.containsNegative(list2)) {
            System.out.println("ds 2 chua so am");
        }else {
            System.out.println("ds 2 khong chua so am");
        }
    }
}
