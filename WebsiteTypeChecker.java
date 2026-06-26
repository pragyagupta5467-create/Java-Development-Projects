import java.util.Scanner;
public class WebsiteTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website URL: ");
        String url = sc.nextLine();
        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Unknown Website Type");
        }
        sc.close();
    }
}
