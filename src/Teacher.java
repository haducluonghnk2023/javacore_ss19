import java.util.Scanner;

public class Teacher implements IApp{
    @Override
    public void displayData() {
        System.out.println("information teacher ");
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("enter information teacher ");
    }
    @Override
    public void sayHello(String name) {
        System.out.println("good bye " + name);
    }
}
