import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       //System.out.println(" hey ayush ");
              //  question no1
        //float a = (7/4.0f)*9/2.0f;
       //  System.out.println(a);/*
             //question no 2
        System.out.println("enter your m no-");
        Scanner ayush =new Scanner(System.in);
        int m= ayush.nextInt();
        System.out.println("enter your p no-");
        int p= ayush.nextInt();
        System.out.println("enter your c no-");
        int c= ayush.nextInt();
        System.out.println("enter your h no-");
        int h= ayush.nextInt();
        System.out.println("enter your e no-");
        int e= ayush.nextInt();
        System.out.println("your total no -");
        int totalsum= p+c+m+h+e;
        System.out.println(totalsum);
        int totalsum1=totalsum*100;
        int totalno=500;
        int per=totalsum1/totalno;
        System.out.println("your % no--");
        System.out.println(per);
               //question no-3
        char grade='b';
        grade=(char)(grade+8);

        System.out.println(grade);
        grade=(char) (grade-8);
        System.out.println(grade);
            //question no-4
        System.out.println("enter your no-");
        int no= ayush.nextInt();
        int givenno= 100000;
        System.out.println(givenno>no);
              //question no-5
        System.out.println(7*49/7+35/7);
    }
}