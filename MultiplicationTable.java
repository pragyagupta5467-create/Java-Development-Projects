import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("\nMultiplication Table");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        System.out.println("\nReverse Multiplication Table");
        for(int i=10;i>=1;i--){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}