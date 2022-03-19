import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        Node n4 = new Node("n4");

        DirectedEdge e1 = new DirectedEdge("e1", n1, n2);
        UndirectedEdge e2 = new UndirectedEdge("e2", n1, n3);
        DirectedEdge e3 = new DirectedEdge("e3", n2, n3);
        UndirectedEdge e4 = new UndirectedEdge("e4", n3, n4);
        UndirectedEdge e5 = new UndirectedEdge("e5", n2, n4);


        Graph g1 = new Graph("g1");
        g1.addNode(n1);
        g1.addNode(n2);
        g1.addEdge(e1);
        g1.addEdge(e2);
        g1.addEdge(e3);
        g1.addEdge(e4);
        g1.addEdge(e5);

        ArrayList<Node> nodes = g1.getNodes();
        ArrayList<Edge> edges = g1.getEdges();

        System.out.println("The Nodes:");
        for (int k=0; k<nodes.size(); k++) {
            System.out.print(nodes.get(k).getName());
            System.out.print("\tIn Degree: " + nodes.get(k).getInDegree());
            System.out.println("\tOut Degree: " + nodes.get(k).getOutDegree() + "\n");
        }

        System.out.println("The Edges:");
        for (int k=0; k<edges.size(); k++) {
            System.out.println(edges.get(k).getName());
        }
    }
}
