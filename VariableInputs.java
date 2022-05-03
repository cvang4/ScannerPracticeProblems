import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a string of text: ");
        String one = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Enter a double: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean status = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + one);
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + value);
        System.out.println("Your boolean is " + status);
    }
}

