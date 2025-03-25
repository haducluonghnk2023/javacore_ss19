package Ex.Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        Circle circle = new Circle(n);
        System.out.println("s = " +circle.area());
        Shape.description();
    }
}
