

public class DirectedEdge extends Edge{

    Node inNode;
    Node outNode;

    String name;

    public DirectedEdge(String name){  // normal constructor
        this.name = name;
    }

    public DirectedEdge(String name, Node inNode, Node outNode){ // constructor with initialization

        this.name = name;
        this.inNode = inNode;
        this.outNode = outNode;

    }

    public Node[] getter(){ // get the nodes
        Node[] nodes = {inNode, outNode};
        return nodes;
    }

    public void setter(Node inNode, Node outNode){  // set the nodes if not set with constructor

        this.inNode = inNode;
        this.outNode = outNode;
    }

    public String getName() {
        return this.name;
    }

}
