import java.util.Scanner;
public class EscapeSequenceFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your letter:");
        String letter = sc.nextLine();
        String formattedLetter = "Dear Pragya,\n\t" + letter + "\n\tThanks!";
        System.out.println("\nFormatted Letter:");
        System.out.println(formattedLetter);
    }
}
