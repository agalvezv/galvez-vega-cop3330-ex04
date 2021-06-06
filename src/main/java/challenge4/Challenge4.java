package challenge4;
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter a noun:");
        String noun = inputs.nextLine();

        System.out.println("Enter a verb:");
        String verb = inputs.nextLine();

        System.out.println("Enter an adjective:");
        String adjective = inputs.nextLine();

        System.out.println("Enter an adverb:");
        String adverb = inputs.nextLine();

        String message = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(message);


    }
}
