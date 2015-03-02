/**
 * Created by dba on 3/2/15.
 */
public class multidimensionalarray {
    public static void main(String[] args) {
        int first[][]={{1,2,3,4},{5,6,7},{8,9,0,1}};
        int sceond[][]={{12,13,14,15},{21,24},{31,33,34,32,37,39},{40}};

        System.out.println("---------- first array ----------------");
        change(first);
        System.out.println("\n\n---------- second array ----------------");
        change(sceond);

    }

    public static void change(int x[][]){
        for(int row=0;row<x.length;row++){
            for (int col=0;col<x[row].length;col++){
                System.out.print(x[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
