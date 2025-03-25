package functional_lambda;

public class Demo {
    public static void main(String[] args) {
        // cach 1 : khong su dung bieu thuc lambda
        IMath iMath = new IMath() {
            @Override
            public int addTwoNumbers(int a, int b) {
                return a + b;
            }
        };
        System.out.println(iMath.addTwoNumbers(10, 20));
        // cach 2
        IMath iMath1 = (a, b) -> a + b;
        System.out.println(iMath1.addTwoNumbers(10, 10));
        // su dung lambda + method reference
        IMath iMath2 = Integer::sum;
        System.out.println(iMath2.addTwoNumbers(10, 10));
    }
}
