import java.util.ArrayList;

public class Node {

    ArrayList<Edge> edges = new ArrayList<>();
    int inDegree;
    int outDegree;
    String name;

    public Node(String name){  // constructor
        this.inDegree = 0;
        this.outDegree = 0;
        this.name = name;
    }

    public ArrayList getEdges(){
        return edges;
    }   // returns the edges

    public void addEdge(Edge e1){   // add an edge to the list
        if (!edges.contains(e1))
            edges.add(e1);
    }

    public void removeEdge(Edge e1){    // remove an edge
        edges.remove(e1);
    }

    public int getInDegree(){   // get InDegree
        return this.inDegree;
    }
    public int getOutDegree(){  // get OutDegree
        return this.outDegree;
    }

    public String getName() {
        return this.name;
    }
}
