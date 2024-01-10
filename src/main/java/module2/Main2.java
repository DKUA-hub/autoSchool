package module2;

import com.welcome.Hello;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        Hello hello = new Hello();
        hello.setupName(name);
        hello.welcome();

        System.out.println("Hello, world!");
        hello.byeBay();
    }
}
