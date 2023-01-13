import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>(); // ye syntax h  Linked list ko lane ka
// ismain sare method used ho jate h linkedlist ke ...
        l1.add(1);
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(2);
        l1.add(5);
        l1.addLast(000);/// last main element ko add kar dea ..
        l1.addFirst(999); // satrting main elemment ko add kar deta h
        l1.push(3);
        for (int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));


        }
    }
}

