/**
 * Created by dba on 3/1/15.
 */
import java.util.Random;
public class randomnumber {
    public static void main(String[] args) {
        Random zaji=new Random();
        int number;

        for (int i=0;i<10;i++){
            number=zaji.nextInt(6);
            System.out.println("count )"+(i+1)+" - "+(number+1));
        }
    }
}
