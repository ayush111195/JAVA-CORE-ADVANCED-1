import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        String A="ayushgupta";
        List<String> list1=new ArrayList<String>();       //list ko call karna
        for (int i=0;i<=A.length()-3;i++){
            //for (int j=0;j<=n;j++){
            String B=  A.substring(i,i+3);
            //  System.out.println(B);
            list1.add(B);}                               //list main multipal things add karna


        //  System.out.println(list1);
        Collections.sort(list1);                                         //short karna
        //  System.out.println(list1);
        System.out.println(list1.get(0));                  // list ka element find karna
        System.out.println( (list1.get(list1.size()-1)));
    }
}