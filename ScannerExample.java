import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is today?");
        String one = scanner.nextLine();
        System.out.println("What will you be learning today?");
        String two = scanner.nextLine();
        System.out.println("Is it sunny or cloudy?");
        String three = scanner.nextLine();


        System.out.println("You wrote:");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}