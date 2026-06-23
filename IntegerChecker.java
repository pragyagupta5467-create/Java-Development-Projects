import java.util.Scanner;
public class IntegerChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        if (sc.hasNextInt()) {
            System.out.println("The entered value is an Integer.");
        } else {
            System.out.println("The entered value is NOT an Integer.");
        }
        sc.close();
    }
}
