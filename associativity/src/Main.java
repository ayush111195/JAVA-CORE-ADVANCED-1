        public class Main {
        public static void main(String[] args) {
        //precedence & associativivity
       // int a = 6*5-34/2;
        // a=30-17
        //   a= 13
        //System.out.println(a);
        //int b = 60/5-34*2;
        // b= 12-68
        // b = -56
        //System.out.println(b);
        //sabse pehle hum log highest precedence dekhte h
            // agr precedence same h to associativity ko dekha jata h
        //  int   a=b=5;
        //  iska mtlb pehle b=5 uske baad  a=b ho jayega
                        //ouick quiz(1)
            int x=6;
            int y=2;
            int a1 =(x-y)/2;
            System.out.println(a1);
                             // (2)
            int a=1;
            int b=4;
            int c=3;
            int a2=(b*b-4*a*c)/(2*a);
            System.out.println(a2);
                              //(3)
            int v=6;
            int u=4;
            int a3= (v*v-u*u);
            System.out.println(a3);
                              // (4)
            int d=5;
            int e=3;
            int f=4;
            int a4=d*e-f;
            System.out.println(a4);
    }
}