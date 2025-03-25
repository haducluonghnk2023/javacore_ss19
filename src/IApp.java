import java.util.Scanner;

public interface IApp {
    void displayData();
    void inputData(Scanner sc);
    default void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
