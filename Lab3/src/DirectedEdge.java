

public class DirectedEdge extends Edge{

    Node inNode;
    Node outNode;

    boolean hasNodes;   // If true, the edge already has two nodes

    public DirectedEdge(){  // normal constructor
        this.hasNodes = false;
    }

    public DirectedEdge(Node inNode, Node outNode){ // constructor with initialization

        this.hasNodes = true;
        this.inNode = inNode;
        this.outNode = outNode;

        inNode.addEdge(this);
        outNode.addEdge(this);
        inNode.inDegree ++;
        outNode.outDegree ++;
    }

    public Node[] getter(){ // get the nodes
        Node[] nodes = {inNode, outNode};
        return nodes;
    }

    public void setter(Node inNode, Node outNode){  // set(change) the nodes

        if (this.hasNodes){ // We need to remove the previous nodes
            this.inNode.removeEdge(this);
            this.outNode.removeEdge(this);
            this.inNode.inDegree --;
            this.outNode.outDegree --;
        }

        this.hasNodes = true;
        this.inNode = inNode;
        this.outNode = outNode;

        inNode.addEdge(this);
        outNode.addEdge(this);
        inNode.inDegree ++;
        outNode.outDegree ++;
    }
}
