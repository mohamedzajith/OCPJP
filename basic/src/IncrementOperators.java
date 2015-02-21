/**
 * Created by hp on 2/21/15.
 */

import java.util.Scanner;

public class IncrementOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int numb = sc.nextInt();
        //System.out.println("++number >>>"+ (++numb));
        //System.out.println("--number >>>"+ (--numb));
        //System.out.println("number++ >>>"+ (numb++));
        //System.out.println("number-- >>>"+ (numb--));
        //System.out.println("number+=3 >>>"+ (numb +=3 ));
        System.out.println("number-=8 >>>" + (numb -= 8));

    }
}
