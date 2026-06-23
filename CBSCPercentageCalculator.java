import java.util.Scanner ;
   public class CBSCPercentageCalculator{
      public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your Physics marks : ");
          int Physics = sc.nextInt();
          System.out.println("Enter Your English marks");
          int English = sc.nextInt();
          System.out.println("Enter your Chemistry marks : ");
          int Chemistry = sc.nextInt();
          System.out.println("Enter Your mathematics marks");
          int mathematics = sc.nextInt();
          System.out.println("Enter your Computer marks : ");
          int Computer = sc.nextInt();
          
          float Percentage = ((Physics + English + Chemistry + mathematics + Computer)/500.0f)*100;

          System.out.println("Percentage : ");
          System.out.println(Percentage);
      } 

 }