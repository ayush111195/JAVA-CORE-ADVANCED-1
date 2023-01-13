//anonymous class ka use h ki jo bhi class neeche comment out h uski jgh hum ddirect anonymous class ka use kar skte h
    interface ayush{
        void math();
        void  math1();
    }
//     class Anonydemo implements ayush{
//       public void math(){
//
//           System.out.println("i am math1");
//        }
//
//         @Override
//         public void math1() {
//             System.out.println("i am in math 2");
//         }
//
//         public void  display(){
//            System.out.println("hello");
//
//        }
//   }
    public class Main {
    public static void main(String[] args) {

//Anonydemo ad=new Anonydemo();
//        ayush ad=new Anonydemo(); // hum ye bhi  kar skte h
//ad.math();
                   ayush ad=new ayush() {         ///     ---->>>  // yahi h anonymous class
                       @Override
                       public void math() {
                           System.out.println("i am in math 1");
                       }

                       @Override
                       public void math1() {
                           System.out.println("i am in math 2");

                       }
                   };
ad.math();
            }
        }


