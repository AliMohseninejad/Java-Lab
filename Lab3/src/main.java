

public class main {
    public static void main(String[] args){

        Node n1 = new Node();
        Node n2 = new Node();

        DirectedEdge e1 = new DirectedEdge(n2, n1);


        Graph g1 = new Graph();
        g1.addNode(n1);
        g1.addNode(n2);
        g1.addEdge(e1);
    }
}
