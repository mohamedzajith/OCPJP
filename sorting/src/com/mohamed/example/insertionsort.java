package com.mohamed.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dba on 5/10/15.
 */
public class insertionsort {
    int[] A;
    int len;

    public void insertion(){
        for (int i=1;i<=A.length-1;i++){
            int value = A[i];
            int hole = i;
            while (hole>0 && A[hole-1]>value){
                A[hole]=A[hole-1];
                hole=hole-1;
            }
            A[hole]=value;
            System.out.println(Arrays.toString(A));
        }
    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.len = sc.nextInt();
        this.A = new int[len];
        for (int i=0;i<len; i++){
            System.out.print("Value "+(i+1)+" : ");
            A[i]=sc.nextInt();
        }
    }

    public void display(){
        for (int i:A){
            System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        insertionsort in = new insertionsort();
        in.read();
        in.insertion();
        in.display();


    }
}
