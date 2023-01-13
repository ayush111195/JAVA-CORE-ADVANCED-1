public class Main {
    public static void main(String[] args) {

                                   // 1-d arrays---

        /*class room of 5 students- you hae to store the marks of them
        you have to options-
        1.made 5 variable
        2.made arrays */


// 1. declaration-memory allocation--

//        int []marks=new int[5];
//        marks[0]=100;
//        marks[1]=90;
//        marks[2]=80;
//        marks[3]=70;
//        marks[4]=60;
//        System.out.println(marks[4]);

// 2. declaration then memory allocation--

//        int [] marks;
//        marks=new int[5];
//        marks[0]=100;
//        marks[1]=90;
//        marks[2]=80;
//        marks[3]=70;
//        marks[4]=60;
//        System.out.println(marks[0]);

// 3. declaration + memory allocation--

//        int[] marks={100,90,80,70,60};
//        System.out.println(marks[3]);


//        we can also use arrays in the strings -----

//        String [] name={"ayush", "sagar", "rahul","shivam","prashant","aman"};
//        System.out.println(name[2]);

//        float[] marks={ 100.5f,90.5f,80.5f,70.5f,60.5f};
//        System.out.println(marks[3]);

//         find the arrays length--

//        int[] marks={100,90,80,70,60};
//        System.out.println(marks.length);


//  (1) displaying the arrays(naive way)
//        int[] marks={100,90,80,70,60};
//        System.out.println("printing using naive way ");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

//   (2)displaying the arrays(using loops)
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);

//   (3)displaying the arrays in reverse order (for loop)
//           for (int i=marks.length-1;i>=0 ;i--){
//               System.out.println(marks[i]);
//           }

//    (4)quick quize: displaying the arrays( for-each loops)

//        displaying the arrays using (for-each loop)
//        System.out.println("printing using for each loop");
//           for (int element :marks){
//               System.out.println(element);
//           }

                              // 2-d arrays----

//        int [][]a;
//        a=new int[2][3];
//        a[0][0]=10;
//        a[0][1]=20;
//        a[0][2]=30;
//        a[1][0]=40;
//        a[1][1]=50;
//        a[1][2]=60;

                    //or
//        int[][]a =new int[2][3];
//        a=new int[2][3];
//        a[0][0]=10;
//        a[0][1]=20;
//        a[0][2]=30;
//        a[1][0]=40;
//        a[1][1]=50;
//        a[1][2]=60;

                   //or
//        int[][]a={{10,20,30},{40,50,60}};

//        System.out.println(a[1][1]);

                //question--
//        System.out.println(b[0][1]);
        //using loop==
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//        }
        //using reverse loop==
//        for (int i=a.length-1;i>=0;i--){
//            for (int j=a[i].length-1;j>=0;j--){
//                System.out.println(a[i][j]);
//            }
//        }
                                 //3-d-arrays---

        int a[][][]={{{10,20,30},{40,50,60},{70,80,90}}};
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
        }
            

    }

}
}