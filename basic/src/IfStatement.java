/**
 * Created by hp on 2/21/15.
 */

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age :");
        int age = sc.nextInt();
        //if condition only
        if (age == 1) {
            System.out.println("iam a " + age + " baby");
        }

        //if elseif else condition only
        if (age > 1 && age <= 6) {
            System.out.println("iam a " + age + " Child");
        } else if (age > 6 && age <= 14) {
            System.out.println("iam a student ");
        } else {
            System.out.println("iam a ADULT");
        }

        //if else
        System.out.println("your brother age");
        int bro_age = sc.nextInt();
        int marriage_age = 30;
        if (marriage_age > bro_age) {
            System.out.println("your brother is not married");
        } else {
            System.out.println("your brother is married");
        }
    }
}
