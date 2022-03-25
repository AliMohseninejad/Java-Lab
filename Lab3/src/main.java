import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        Node n4 = new Node("n4");

        DirectedEdge e1 = new DirectedEdge("e1", n1, n2);
        DirectedEdge e2 = new DirectedEdge("e2", n1, n3);
        DirectedEdge e3 = new DirectedEdge("e3", n2, n3);
        DirectedEdge e4 = new DirectedEdge("e4", n3, n4);
        UndirectedEdge e5 = new UndirectedEdge("e5", n2, n4);

        DirectedEdge[] dEdges = {e1,e2,e3,e4};

        DirectedGraph g1 = new DirectedGraph("g1");
        DirectedGraph g2 = new DirectedGraph("g2", dEdges);

        g1.addNode(n1);
        g1.addNode(n2);
        g1.addEdge(e1);
        g1.addEdge(e2);
        g1.addEdge(e3);
        g1.addEdge(e4);
        g1.addEdge(e5);

        ArrayList<Node> g1_nodes = g1.getNodes();
        ArrayList<Edge> g1_edges = g1.getEdges();
        ArrayList<Node> g2_nodes = g2.getNodes();
        ArrayList<Edge> g2_edges = g2.getEdges();

        System.out.println("g1:\n");
        System.out.println("The Nodes:");
        for (Node g1_node : g1_nodes) {
            System.out.print(g1_node.getName());
            System.out.print("\tIn Degree: " + g1_node.getInDegree());
            System.out.println("\tOut Degree: " + g1_node.getOutDegree() + "\n");
        }

        System.out.println("The Edges:");
        for (Edge g1_edge : g1_edges) {
            System.out.println(g1_edge.getName());
        }


        System.out.println("\n\ng2:\n");
        System.out.println("The Nodes:");
        for (Node g2_node : g2_nodes) {
            System.out.print(g2_node.getName());
            System.out.print("\tIn Degree: " + g2_node.getInDegree());
            System.out.println("\tOut Degree: " + g2_node.getOutDegree() + "\n");
        }

        System.out.println("The Edges:");
        for (Edge g2_edge : g2_edges) {
            System.out.println(g2_edge.getName());
        }
    }
}
