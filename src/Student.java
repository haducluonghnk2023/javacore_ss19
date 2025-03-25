import java.util.Scanner;

public class Student implements IApp{
    @Override
    public void displayData() {
        System.out.println("information student " );
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("enter information student ");
    }
}
