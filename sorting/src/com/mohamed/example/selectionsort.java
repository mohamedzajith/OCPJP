package com.mohamed.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dba on 5/9/15.
 */
public class selectionsort {
    int[] A;
    int len;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.len = sc.nextInt();
        this.A = new int[len];
        for (int i=0;i<len;i++){
            System.out.print("Value " + (i + 1) + " : ");
            A[i] = sc.nextInt();
        }
    }

    public void selection(){
        for(int i=0;i<=A.length-2;i++){
            int imin=i;
            for (int j=i+1;j<=A.length-1;j++){
                if(A[j]<A[imin])
                    imin=j;
            }
            int temp=A[i];
            A[i]=A[imin];
            A[imin]=temp;
            System.out.println(Arrays.toString(A));
        }
    }

    public void display(){
        for (int i:A){
            System.out.print(i+"  ");
        }
    }

    public static void main(String[] args) {
        selectionsort sc = new selectionsort();
        sc.read();
        sc.display();
        sc.selection();
        sc.display();
    }
}
