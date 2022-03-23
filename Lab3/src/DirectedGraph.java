import java.util.ArrayList;

public class DirectedGraph extends Graph{


    public DirectedGraph(String name) {
        super(name);
    }

    public DirectedGraph(String name, DirectedEdge[] edges){
        super(name, edges);
    }

    @Override
    public void addEdge(Edge e1) {

    }

    public void addEdge(DirectedEdge e1) {
        super.addEdge(e1);
        System.out.println(e1.getClass().getName());
    }

}
