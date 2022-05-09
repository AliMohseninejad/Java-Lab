import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws CloneNotSupportedException {

    //    test_MyArrayList();
        test_MyLinkedList();

    }

    public static void test_MyArrayList() {
        MyArrayList<Integer> arrayList1 = new MyArrayList<>();

        System.out.println("\n\n*** arrayList ***\n");
        for (int i=0; i<99; i++) {
            arrayList1.add(i);
            System.out.println("len: " + arrayList1.len() + ", size: " + arrayList1.memory());
        }
        for (int i=80; i>=0; i--) {
            arrayList1.remove(i);
            System.out.println("len: " + arrayList1.len() + ", size: " + arrayList1.memory());
        }

        System.out.println("MyArrayList test completed!");
    }

    public static void test_MyLinkedList() throws CloneNotSupportedException{
        MyLinkedList<Integer> linkedList1 = new MyLinkedList<>();

        linkedList1.insert(1, 0);
        linkedList1.insert(2);
        linkedList1.insert(3,0);
        linkedList1.insert(4,1);
        linkedList1.insert(5,4);

        System.out.println("\n\n*** linkedList ***\n");

        for (int i=0; i< linkedList1.len(); i++)
            System.out.println("item at index=" + i + ": "+ linkedList1.get(i));
        System.out.println("len:" + linkedList1.len() + "\n");

        linkedList1.remove();
        linkedList1.remove(2);
        linkedList1.remove(0);
        linkedList1.remove(1);

        for (int i=0; i< linkedList1.len(); i++)
            System.out.println("item at index=" + i + ": "+ linkedList1.get(i));
        System.out.println("len:" + linkedList1.len());
    }

}
