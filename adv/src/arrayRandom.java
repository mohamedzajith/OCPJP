/**
 * Created by dba on 3/2/15.
 */
import java.util.Random;
public class arrayRandom {
    public static void main(String[] args) {
        int dice[]=new int[7];
        Random rand = new Random();

        for(int count=1;count<500;count++){
            dice[1+rand.nextInt(6)]++;
        }
        System.out.println("face\ttime");

        for(int face=1;face<dice.length;face++){
            System.out.println(face+"\t\t"+dice[face]);

        }

    }
}
