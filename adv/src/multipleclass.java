/**
 * Created by dba on 3/1/15.
 */
import java.util.*;
public class multipleclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student obj=new student();

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        obj.name(age);
    }
}
