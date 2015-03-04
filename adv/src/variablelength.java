/**
 * Created by dba on 3/4/15.
 */
public class variablelength {
    public static void main(String[] args) {
        System.out.println(average(12,23,23,12,12,23,23,12,21,23,32,12,31));
    }
    public static int average(int...number){
        int total=0;
            for (int x:number) {
                total += x;
            }
        return total/number.length;
    }


}
