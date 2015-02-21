import java.util.Scanner;

/**
 * Created by hp on 2/21/15.
 * math operators Addition, subtraction, multi, Division....
 */
public class mathOperators {
    public static void main(String[] args) {


        double a = 2, b = 3, c = 5, d = 4;
        double Addition, subtraction, multipication, Division;
        Addition = a + d + b;
        System.out.println("Total Addition value is " + Addition);
        subtraction = c - d;
        System.out.println("total subtraction  value is " + subtraction);
        multipication = a * b * c * d;
        System.out.println("total multipication value is " + multipication);
        Division = c / d;
        System.out.println("total Division value is " + Division);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number 1 :");
        double num1 = sc.nextDouble();
        System.out.println("Enter the number 2 :");
        double num2 = sc.nextDouble();

        System.out.println("number 1 + number 2 = " + (num1 + num2));
        System.out.println("number 1 - number 2 = " + (num1 - num2));
        System.out.println("number 1 * number 2 = " + (num1 * num2));
        System.out.println("number 1 / number 2 = " + (num1 / num2));
    }
}
