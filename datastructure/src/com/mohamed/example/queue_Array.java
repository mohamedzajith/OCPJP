package com.mohamed.example;

import java.util.Scanner;

/**
 * Created by dba on 5/17/15.
 */
public class queue_Array {
    private int[] Arr;
    private int len;
    private int front = -1;
    private int rear = -1;

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the queue length : ");
        this.len = sc.nextInt();
        this.Arr = new int[len];
    }

    public void push(int x){
        if ((rear+1)%len == front){
            System.out.print(x+" cannot be added because queue is FULL!!\n");
        }else if (isEmpty()){
            rear=0;
            front=0;
            Arr[rear] = x;
            System.out.print(Arr[rear]+" is addedxxx in queue\n");
        }else {
            rear = (rear+1)%len;
            Arr[rear] = x;
            System.out.print(Arr[rear]+" is added in queue\n");
        }
    }

    public boolean isEmpty(){
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public void pop(){
        if (isEmpty()){
            System.out.print("queue is Empty\n");
        }else if (front == rear){
            System.out.print(Arr[front]+" is remove from queue\n");
            front = -1;
            rear = -1;
        }else {
            System.out.print(Arr[front]+" is remove from queue\n");
            front = (front+1)%len;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.print("queue is Empty\n");
        }else {
            System.out.print("lase add element is "+Arr[rear]+"\n");
        }
    }

    public static void main(String[] args) {
        queue_Array qu = new queue_Array();
        qu.read();
        //qu.push(12);
        qu.push(21);
        //qu.pop();
        //qu.pop();
        qu.push(131);
        //qu.pop();
        qu.push(111);
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.push(222);
        qu.push(333);
        qu.push(444);
        qu.pop();
        qu.push(555);
        qu.peek();

    }
}
