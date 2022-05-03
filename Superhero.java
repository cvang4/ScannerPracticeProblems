import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String one = scanner.nextLine();
        System.out.println("What is their superpower?");
        String two = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + one + ", who had the power of " + two + ".");
        System.out.println("As they grew older " + one + " saw that the world needed them.");
        System.out.println(one + " used their ability to " + two + " to save the world.");
    }
}
