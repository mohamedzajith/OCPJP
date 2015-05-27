package Number.Play.Test;

/**
 * Created by dba on 5/27/15.
 */
public class mergesotr extends new_num_play{
    protected int[] TempArr;

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

    public void display(int[] TempArr){
        for (int i:TempArr){
            System.out.print(i + "  ");
        }
    }
}
