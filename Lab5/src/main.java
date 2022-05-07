import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        test_MyArrayList();


    }

    public static void test_MyArrayList() {
        MyArrayList<Integer> arrayList1 = new MyArrayList<>();

        for (int i=0; i<99; i++) {
            arrayList1.add(i);
            System.out.println("len: " + arrayList1.len() + ", size: " + arrayList1.memory());
        }
        for (int i=80; i>=0; i--) {
            arrayList1.remove(i);
            System.out.println("len: " + arrayList1.len() + ", size: " + arrayList1.memory());
        }

        System.out.println("MyArrayList test completed!\n\n");
    }
}
