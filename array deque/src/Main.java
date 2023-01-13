import java.util.ArrayDeque;
import java.util.ArrayList;

public class
Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 =new ArrayDeque<>(); // ye syntax h array list ko lane ka

        l1.add(1);
        l1.add(3);
        l1.add(7);
        l1.add(9);
        l1.add(2);
        l1.add(5);
        l1.addFirst(777);
        l1.addLast(9999);

            System.out.println(l1.peekLast());
           System.out.println(l1.getFirst());


        }
    }

