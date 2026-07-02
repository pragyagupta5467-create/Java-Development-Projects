import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] sum = new int[2][3];

        System.out.println("Enter First Matrix:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Second Matrix:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Result:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}