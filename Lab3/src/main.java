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

        Edge edges[] = {e1,e2,e3,e4,e5};
        DirectedEdge dEdges[] = {e1,e2,e3,e4};

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
        for (int k=0; k<g1_nodes.size(); k++) {
            System.out.print(g1_nodes.get(k).getName());
            System.out.print("\tIn Degree: " + g1_nodes.get(k).getInDegree());
            System.out.println("\tOut Degree: " + g1_nodes.get(k).getOutDegree() + "\n");
        }

        System.out.println("The Edges:");
        for (int k=0; k<g1_edges.size(); k++) {
            System.out.println(g1_edges.get(k).getName());
        }


        System.out.println("\n\ng2:\n");
        System.out.println("The Nodes:");
        for (int k=0; k<g2_nodes.size(); k++) {
            System.out.print(g2_nodes.get(k).getName());
            System.out.print("\tIn Degree: " + g2_nodes.get(k).getInDegree());
            System.out.println("\tOut Degree: " + g2_nodes.get(k).getOutDegree() + "\n");
        }

        System.out.println("The Edges:");
        for (int k=0; k<g2_edges.size(); k++) {
            System.out.println(g2_edges.get(k).getName());
        }
    }
}
