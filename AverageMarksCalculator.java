import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] marks = new float[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextFloat();
        }

        float sum = 0;

        for (float m : marks) {
            sum += m;
        }

        float avg = sum / marks.length;

        System.out.println("Average = " + avg);

        sc.close();
    }
}