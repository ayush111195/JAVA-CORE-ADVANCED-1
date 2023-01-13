import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Integer>hs=new HashSet<>(7,0.75f); // capacity aur factorko define kar skte h
      hs.add(66);
      hs.add(99);
      hs.add(77);
      hs.add(99);
        System.out.println(hs);
    }
}