package Ex.Ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","lambda","Stream","functional");
        StringProcessor processor = input -> input.toLowerCase() + " - TECHNICAL";
        List<String> list2 = new ArrayList<>();
        for(String s: list){
            list2.add(processor.process(s));
        }
        processor.printList(list2);
    }
}
