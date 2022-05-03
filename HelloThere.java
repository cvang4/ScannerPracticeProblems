import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Hello there! How are you doing today?");
        String one = scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String two = scanner.nextLine();

        System.out.println(one);
        System.out.println(two);
        System.out.println("Awesome! Good bye!");
    }
}
