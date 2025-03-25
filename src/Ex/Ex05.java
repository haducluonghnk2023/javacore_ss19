package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.println("Nhập danh sách chuỗi");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        int cnt=0;
        for(int i=0;i<list.size();i++){
            if (list.get(i).startsWith("A") && list.get(i).length() >=5){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
