import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int factorial=1;
        //Using For Loop
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial using For Loop = "+factorial);
        //Using While Loop
        factorial=1;
        int i=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial using While Loop = "+factorial);
        sc.close();
    }
}