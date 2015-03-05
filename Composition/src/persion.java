/**
 * Created by dba on 3/5/15.
 */
public class persion {
    private job JOB;

    public persion(){
        this.JOB=new job();
        JOB.setSalary(234445.5);
    }

    public double getSalary() {
        return this.JOB.getSalary();
    }
}
