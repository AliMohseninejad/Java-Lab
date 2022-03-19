

public class DirectedEdge extends Edge{
    Node inNode;
    Node outNode;

    public DirectedEdge(){

    }

    public DirectedEdge(Node inNode, Node outNode){

    }

    public Node[] getter(){
        Node[] nodes = {inNode, outNode};
        return nodes;
    }

    public void setter(Node inNode, Node outNode){
        this.inNode = inNode;
        this.outNode = outNode;
    }
}
