/**
 * Created by hp on 2/21/15.
 * this is used for keybord input
 */

import java.util.Scanner;

public class st_veriablekeyboardinput {
    public static void main(String[] args) {
        //keyboard input call
        Scanner sc = new Scanner(System.in);

        //String variable input one word
        System.out.println("Enter you name ");
        String name = sc.next();
        System.out.println("my name is " + name);
/*
        //String variable input many word
        System.out.println("Enter you address ");
        String add=sc.nextLine();
        System.out.println("my address is "+add);
/*
        //number input integer
        System.out.println("input integer number");
        int num=sc.nextInt();
        System.out.println("Integer number is " + num);

        //number input double
        System.out.println("input double number");
        double do_num=sc.nextDouble();
        System.out.println("Double number is " + do_num);
        */
    }
}
