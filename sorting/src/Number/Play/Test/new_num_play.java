package Number.Play.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dba on 5/26/15.
 */
public class new_num_play {
    protected int[] Arr;
    protected int len;

    public int[] read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        this.len = sc.nextInt();
        this.Arr= new int[len];

        for (int i=0;i<len;i++){
            System.out.print("Value " + (i + 1) + " : ");
            Arr[i] = sc.nextInt();
        }
        return Arr;
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

    public int[] getArr() {
        return Arr;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
