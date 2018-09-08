import java.util.LinkedList;

public class MyCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(1);
        list.add(15);
        System.out.println(list.getLast());
    }
}
