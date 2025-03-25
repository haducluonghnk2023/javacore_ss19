package Ex.Ex08;

import Ex.Ex07.ListProcessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListProcessorImpl listProcessorImpl = new ListProcessorImpl();
        List<Integer> list1 = Arrays.asList(5,7,10,13,6,3);
        List<Integer> list2 = Arrays.asList(2,4,6,8);
        ListProcessor.printList(list1);
        System.out.println("tong cac so le :" + listProcessorImpl.sumOddNumbers(list1));
        if (listProcessorImpl.checkOdd(list1)) {
            List<Integer> oddNumbers1 = new ArrayList<>();
            for (Integer num : list1) {
                if (num % 2 != 0) {
                    oddNumbers1.add(num);
                }
            }
            System.out.println("cac so le :" + oddNumbers1);
        }
        ListProcessor.printList(list2);
        System.out.println("tong cac so le :" + listProcessorImpl.sumOddNumbers(list2));
        if (listProcessorImpl.checkOdd(list2)) {
            List<Integer> oddNumbers2 = new ArrayList<>();
            for (Integer num : list2) {
                if (num % 2 != 0) {
                    oddNumbers2.add(num);
                }
            }
            System.out.println("cac so le :" + oddNumbers2);
        } else {
            System.out.println("Khong co phan tu le");
        }
    }
}
