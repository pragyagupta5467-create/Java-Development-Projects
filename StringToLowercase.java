import java.util.Scanner;
public class StringToLowercase {    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = r.nextLine();
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}
