import java.util.Scanner;
public class KilometerTometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometer = sc.nextDouble();
        double meter = kilometer * 1000;
        System.out.println("Distance in meters = " + meter);
        sc.close();
    } 
}
