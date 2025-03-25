package Ex;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","", "Lambda", "Stream","");
        check(list);
    }
    public static void check(List<String> list){
        List<String> list1 = new ArrayList<>();
        for(String s: list){
            if (!s.isEmpty()){
                list1.add(s);
            }
        }
        System.out.println(list1);
    }
}
