

public class UndirectedEdge extends Edge{

    Node[] nodes = new Node[2];

    public UndirectedEdge(){

    }

    public UndirectedEdge(Node node1, Node node2){

    }

    public Node[] getter(){
        return nodes;
    }

    public void setter(Node node1, Node node2){
        this.nodes[0] = node1;
        this.nodes[1] = node2;
    }

}
