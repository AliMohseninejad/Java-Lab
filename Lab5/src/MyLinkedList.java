
public class MyLinkedList<E> {

    Node head=null;

    // insert at the end of the list
    public void insert(E e) {
        // this is the first item
        if (this.head==null) {
            this.head = new Node(e);
        }
        else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(e);
        }
    }

//    public void insert(E e, int idx) {

//    }


    private class Node {
        E data;
        Node next;

        Node(E d) {
            this.data = d;
            this.next = null;
        }
    }

}


