import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);
        Date d2=new Date();
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.getDate());
        System.out.println(d1.getDay());
        System.out.println(d1.getSeconds());
        System.out.println(d1.getYear());  // year ye 1900 ke baad ke btata h iske leye hum logo ko 1900+out ko jodna padega
         int a=d1.getYear();
        System.out.println(1900+a);
        System.out.println(d1.getHours());


    }
}