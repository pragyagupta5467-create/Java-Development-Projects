import java.util.Scanner;

public class DetectMultipleSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Double Space Index: " + str.indexOf("  "));
        System.out.println("Triple Space Index: " + str.indexOf("   "));
    }
}
