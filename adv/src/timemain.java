/**
 * Created by dba on 3/5/15.
 */
public class timemain {
    public static void main(String[] args) {
        timeclass tim=new timeclass();
        tim.setTime(13,4,23);
        System.out.println(tim.tomilitory());
        tim.setTime(23,34,40);
        System.out.println(tim.toString());

        tim.setTime(8,34,40);
        System.out.println(tim.toString());

    }
}
