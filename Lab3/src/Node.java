import java.util.ArrayList;

public class Node {

    ArrayList<Edge> edges = new ArrayList<>();
    int inDegree;
    int outDegree;

    public Node(){
        this.inDegree = 0;
        this.outDegree = 0;
    }

    public ArrayList getEdges(){
        return edges;
    }

    public void addEdge(){

    }

    public void removeEdge(){

    }

    public int getInDegree(){
        return this.inDegree;
    }
    public int getOutDegree(){
        return this.outDegree;
    }
}
