import java.util.ArrayList;

public class Tree extends DirectedGraph {


    public Tree(String name) {
        super(name);
    }


    @Override
    public void addEdge(DirectedEdge e1) {

        Node[] inOutNode = e1.getter();

        if (!inOutNode[0].equals(inOutNode[1])) { // Loops are not allowed in trees

            if (this.nodes.size()==0 || (this.nodes.contains(inOutNode[1])) && (!this.nodes.contains(inOutNode[0]))) { // Connected graph and inDegree <= 1
                super.addEdge(e1);
                inOutNode[0].father = inOutNode[1];
                inOutNode[1].children.add(inOutNode[0]);
            }
        }
    }

    public Node getFather(Node n1) {
        return n1.father;
    }

    public ArrayList<Node> getChildren(Node n1) {
        return n1.children;
    }

    public ArrayList<Node> getAncestors(Node n1) {
        ArrayList<Node> ancestors = new ArrayList<>();

        Node currentNode = n1;
        while (currentNode.father != null) {
            ancestors.add(currentNode.father);
            currentNode = currentNode.father;
        }
        return ancestors;
    }
}
