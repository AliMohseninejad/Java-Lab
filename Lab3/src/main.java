import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        Node n1 = new Node("n1");
        Node n2 = new Node("n2");

        DirectedEdge e1 = new DirectedEdge("e1", n2, n1);


        Graph g1 = new Graph("g1");
        g1.addNode(n1);
        g1.addNode(n2);
        g1.addEdge(e1);

        ArrayList<Node> nodes = g1.getNodes();
        ArrayList<Edge> edges = g1.getEdges();

        System.out.println("The Nodes:");
        for (int k=0; k<nodes.size(); k++)
            System.out.println(nodes.get(k).getName());

        System.out.println("The Edges:");
        for (int k=0; k<edges.size(); k++)
            System.out.println(edges.get(k).getName());
    }
}
