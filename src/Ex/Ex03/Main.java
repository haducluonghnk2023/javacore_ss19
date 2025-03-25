package Ex.Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        System.out.println("a+b = "+MathOperations.add(a,b));
        System.out.println("a-b = "+MathOperations.sub(a,b));
        System.out.println("a*b = "+MathOperations.mul(a,b));
        System.out.println("a/b = "+MathOperations.div(a,b));
    }
}
