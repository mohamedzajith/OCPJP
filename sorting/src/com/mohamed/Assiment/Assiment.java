package com.mohamed.Assiment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dba on 5/15/15.
 */
public class Assiment {
    private int[] Arr;
    private int len;
    private int[] TempArr;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.len = sc.nextInt();
        this.Arr= new int[len];

        for (int i=0;i<len;i++){
            System.out.print("Value " + (i + 1) + " : ");
            Arr[i] = sc.nextInt();
        }
    }

    public void bubble(){
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
            System.out.println(Arrays.toString(Arr));
        }
    }

    public void display(){
        for (int i:Arr){
            System.out.print(i + "  ");
        }
    }

    public void display(int[] TempArr){
        for (int i:TempArr){
            System.out.print(i + "  ");
        }
    }

    public void domerge(int[] A,int[] B){
        this.TempArr = new int[A.length+B.length];
        int i=0,j=0,k=0;
        while (i<A.length && j<B.length){
            if (A[i]<B[j]){
                TempArr[k++]=A[i++];
            }
            else {
                TempArr[k++]=B[j++];
            }
        }
        while (i<A.length){
            TempArr[k++]=A[i++];
        }
        while (j<B.length){
            TempArr[k++]=B[j++];
        }
        display(TempArr);
    }

    public static void main(String[] args) {
        Assiment bu = new Assiment();
        bu.read();
        bu.bubble();
        bu.display();
        System.out.println();

        Assiment bu1 = new Assiment();
        bu1.read();
        bu1.bubble();
        bu1.display();
        System.out.println();
        
        Assiment bu2 = new Assiment();
        bu2.domerge(bu.Arr,bu1.Arr);

    }
}

