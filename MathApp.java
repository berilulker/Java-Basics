import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("First number:\t");
     double num1 = input.nextDouble();

     System.out.print("Second number:\t");
     double num2 = input.nextDouble();

     System.out.println("\n\t----Results----");
     System.out.printf("Sum:\t%.0f", (num1 + num2));
     System.out.printf("\nDifference:\t%.0f", (num1 - num2));
     System.out.printf("\nMultiplication:\t%.0f", (num1 * num2));
     System.out.printf("\nDivision:\t%.0f", (num1 / num2));

     input.close();

    }
}