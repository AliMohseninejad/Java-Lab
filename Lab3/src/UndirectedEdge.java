

public class UndirectedEdge extends Edge{

    Node[] nodes = new Node[2];

    boolean hasNodes;   // If true, the edge already has two nodes
    String name;

    public UndirectedEdge(String name){    // normal constructor
        this.hasNodes = false;
        this.name = name;
    }

    public UndirectedEdge(String name, Node node1, Node node2){  // constructor with initialization

        this.hasNodes = true;
        this.name = name;
        this.nodes[0] = node1;
        this.nodes[1] = node2;

        node1.addEdge(this);
        node2.addEdge(this);
        node1.inDegree ++;
        node1.outDegree ++;
        node2.outDegree ++;
        node2.inDegree ++;
    }

    public Node[] getter(){ // get the nodes
        return nodes;
    }

    public void setter(Node node1, Node node2){ // set(change) the nodes

        if (this.hasNodes){ // We need to remove the previous nodes
            this.nodes[0].removeEdge(this);
            this.nodes[1].removeEdge(this);
            this.nodes[0].inDegree --;
            this.nodes[0].outDegree --;
            this.nodes[1].inDegree --;
            this.nodes[1].outDegree --;
        }

        this.hasNodes = true;
        this.nodes[0] = node1;
        this.nodes[1] = node2;

        node1.addEdge(this);
        node2.addEdge(this);
        node1.inDegree ++;
        node1.outDegree ++;
        node2.outDegree ++;
        node2.inDegree ++;
    }

    public String getName() {
        return this.name;
    }

}
