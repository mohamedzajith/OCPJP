package com.mohamed.Assiment;

import java.util.Scanner;

/**
 * Created by dba on 5/16/15.
 */
public class assignment {
    private int[] Arr;
    private int len;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.len = sc.nextInt();
        this.Arr = new int[len];
        for (int i=0;i<len;i++){
            System.out.print("Value "+(i+1)+" : ");
            Arr[i] = sc.nextInt();
        }
    }

    public void dosort(){
        for (int k=0;k<Arr.length-1;k++){
            int flag=0;
            for (int i=0;i<Arr.length-1-k;i++){
                if (Arr[i]>Arr[i+1]){
                    int temp=Arr[i];
                    Arr[i]=Arr[i+1];
                    Arr[i+1]=temp;
                    flag=1;
                }
            }
            if (flag==0) break;
        }
    }

    public void display(){
        for (int i:Arr){
            System.out.print(i+"  ");
        }
    }

    public void sum(){
        double total=0;
        for (int i:Arr){
            total = total +i ;
        }
        System.out.print("\nTotal is :" +total);
    }

    public void avg(){
        double total=0;
        for (int i:Arr){
            total = total +i ;
        }
        System.out.print("\nAverage is :" +(total/Arr.length));
    }

    public void min(){
        dosort();
        System.out.print("\nMinimum is :" +Arr[0]);
    }

    public void max(){
        dosort();
        System.out.print("\nMinimum is :" +Arr[Arr.length-1]);
    }

    public static void main(String[] args) {
        assignment ex = new assignment();
        ex.read();
        ex.dosort();
        ex.display();
        ex.sum();
        ex.avg();
        ex.min();
        ex.max();
    }

}
