package com.mohamed.Advance;

import java.util.Scanner;

/**
 * Created by dba on 5/10/15.
 */
public class mergesort {
    private int[] inputArr;
    private int[] tempMergArr;
    private int length;

    public static void main(String a[]){
        mergesort ms = new mergesort();
        ms.read();
        ms.sort();
        ms.display();

    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.length = sc.nextInt();
        this.inputArr = new int[length];
        for (int i=0;i<length;i++){
            System.out.print("Value "+(i+1)+" : ");
            inputArr[i] = sc.nextInt();
        }
    }

    public void display(){
        for(int i:inputArr){
            System.out.print(i+"  ");
        }
    }

    public void sort() {
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);

    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = inputArr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                inputArr[k] = tempMergArr[i];
                i++;
            } else {
                inputArr[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            inputArr[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}
