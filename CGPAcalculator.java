import java.util.Scanner;
public class CGPAcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter marks of Subject 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter marks of Subject 3: ");
        double s3 = sc.nextDouble();
        double percentage = (s1 + s2 + s3) / 3;
        double cgpa = percentage / 9.5;
        System.out.println("CGPA = " + cgpa);
        sc.close();
    }
}

// CGPA is calculated using the standard conversion formula:
// CGPA = Percentage / 9.5