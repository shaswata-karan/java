import java.util.Collections;
import java.util.ArrayList;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(list);

        // get elements
        int element = list.get(1);
        System.out.println(element);

        // add elements
        list.add(1,10);
        System.out.println(list);

        // set element
        list.set(1, 100);
        System.out.println(list);

        // delete elements
        list.remove(1);
        System.out.println(list);

        // list size
        int size = list.size();
        System.out.println(size);

        // add elemnts and create new list
        list.add(6);
        list.add(1);
        list.add(8);
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);

        // clear
        list.clear();
        list.add(200);
        System.out.println(list);

    }
}
