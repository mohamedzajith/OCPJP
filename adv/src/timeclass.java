/**
 * Created by dba on 3/5/15.
 */
public class timeclass {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h,int m,int s){
        hour=((h>0 && h<24) ? h : 0);
        minute=((m>0 && m<60) ? m : 0);
        second=((s>0 && s<60) ? s : 0);
    }

    public String tomilitory(){
        return String.format("%02d:%02d:%02d %s",((hour==0||hour==12) ? 12 : hour%12),minute,second,(hour<12 ? "AM":"PM"));
    }

    public String toString(){

        return String.format("%02d:%02d:%02d %s",((hour==0||hour==12) ? 12 : hour%12),minute,second,(hour<12 ? "AM":"PM"));
    }

}
