import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();
    String name;

    public Graph(String name){
        this.name = name;
    }

    public Graph(Edge[] edges){

    }


    public void addNode(Node n1){   // adds a single node to graph
        if (!nodes.contains(n1))    // checks if the node was already in the nodes list
            nodes.add(n1);
    }

    public void addEdge(Edge e1){   // adds an edge and its corresponding nodes to the graph
        if (!edges.contains(e1)) {
            edges.add(e1);

            Node[] inOutNode = e1.getter();

            if (!nodes.contains(inOutNode[0]))
                nodes.add(inOutNode[0]);
            if (!nodes.contains(inOutNode[1]))
                nodes.add(inOutNode[1]);

        }
    }

    public void removeNode(Node n1){    // remove a node from the graph
        nodes.remove(n1);
    }

    public void removeEdge(Edge e1){    // remove an edge from the graph
        edges.remove(e1);
    }

    public ArrayList getNodes(){    // get the nodes of the graph
        return nodes;
    }

    public ArrayList getEdges(){    // get the edges of the graph
        return edges;
    }

    public String getName() {
        return this.name;
    }

}
