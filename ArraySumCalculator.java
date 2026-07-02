import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        float sum = 0;
        System.out.println("Enter 5 float numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}