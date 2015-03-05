/**
 * Created by dba on 3/5/15.
 */
public class job {
    private String name;
    private double salary;
    private int id;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
