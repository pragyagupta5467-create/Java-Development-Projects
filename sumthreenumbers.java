// Sum Three Numbers
// Calculates the sum of three user-entered numbers.

import java.util.Scanner;
public class sumthreenumbers {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum = " + sum);
        sc.close();
    } 
}
