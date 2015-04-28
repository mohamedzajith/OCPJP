package com.mohamed.primenumber;

import java.util.Scanner;

/**
 * Created by dba on 3/14/15.
 */
public class checkprime {
    public boolean prime(int num){
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkprime cp=new checkprime();
        System.out.print("Enter the number : ");
        int number=sc.nextInt();

        if (number>=2){
            if (cp.prime(number)){
                System.out.println(number+" is prime number");
            }else {
                System.out.println(number+" is not prime number");
            }
        }
        else if (number==0 ||number==1){
            System.out.println("0 or 1 is not consider the prime number");
        }
        else {
            System.out.println("Check your inserting number is negative");
        }
    }
}
