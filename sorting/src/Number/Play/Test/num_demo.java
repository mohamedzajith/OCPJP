package Number.Play.Test;

/**
 * Created by dba on 5/26/15.
 */
public class num_demo extends mergesotr {

    public static void main(String[] args) {
        num_demo nd = new num_demo();
        nd.read();
        nd.display();
        nd.bubble();

        num_demo nd2 = new num_demo();
        nd2.read();
        nd2.display();
        nd2.bubble();

        num_demo fi = new num_demo();
        fi.domerge(nd.Arr,nd2.Arr);

    }
}
