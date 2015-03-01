/**
 * Created by dba on 3/1/15.
 */
public class girlfriend {
    private String girlname;
    //constructor
    public girlfriend(String name){
        girlname=name;
    }
    public void setName(String name){
        girlname=name;
    }
    public String getName(){
       return girlname;
    }
    public void saying(){
        System.out.println("your first girl friend is "+getName());
    }
}
