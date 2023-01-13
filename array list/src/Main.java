import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {



//        ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka
//add function-->>

//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}

//        ArrayList<Integer> l1 =new ArrayList<>();
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(0,2); // element main humne 2 diya to ye index main 0 diya to wo 2 ko 0 index main add karega
//        l1.add(0,5);// ab 0 no par  5 add ho jayega aur upr wala element 2 neeche shift ho jayega ..
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}
// addAll f9uction-->> koi aur array ko ismain add karne ke leye--->>>


//        ArrayList<Integer>l1=new ArrayList<>();
//    ArrayList<Integer> l2 =new ArrayList<>();
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l2.add(12);
//        l2.add(31);
//        l2.add(55);
//        l2.add(66);
//        l2.add(44);
//        l1.addAll(2,l2);  //  agr hum yahi index bhi add kar de to usee no ne add hoga l2
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//        }
//    }
//}

//        array ki leangth fix karna --->>>

//        ArrayList<Integer> l1 =new ArrayList<>(6); // ye syntax h array list ko lane ka h..
//         //  agr hum ()main koi value put karwa de to wo array ke length hoga
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}

    // array ko clear karna--->>


//                ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka
//
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l1.clear();
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}

//clone --->> copy return karega ..

//        ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka
//
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l1.clone();
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//        }
//    }
//}
// contains --->>>
  //      ismain hum pta kar skte h ki koi object h array main  ya nhi..  true print kare to mtlb h false print kare mtlb nhi h


//ArrayList<Integer> l1 =new ArrayList<>();
//
//        l1.add(1);
//                l1.add(3);
//                l1.add(7);
//                l1.add(9);
//                l1.add(2);
//                l1.add(5);
//        System.out.println(l1.contains(9));
//                for (int i=0;i< l1.size();i++){
//        System.out.println(l1.get(i));
//
//
//        }
//        }
//        }
// ensureCapacity--->>>
      //  ye array list ki capicity ko ensure karte h ...


//        ArrayList<Integer> l1 =new ArrayList<>(15); // ye syntax h array list ko lane ka
//
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l1.ensureCapacity(45);
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}
      //  indexof-->> ye hum logo ko ye btayega ki array main kiss place pr kaunsa no h


//        ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka
//
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l1.add(7);
//        System.out.println(l1.indexOf(7));  // 7 no array main kiss indax pr h ye btayega ...
//     //   ab yhan pr do baar "7" to indexof pehle wale 7 ki indax ko btayega ..
//     //   " lastindexof" last wale 7 ki place ko btayega
//        System.out.println(l1.lastIndexOf(7));
//        for (int i=0;i< l1.size();i++){
//         //   System.out.println(l1.get(i));


//        }
//    }
//}

//remove --->>> ye kise bhi possition ke elements ko remove kar deta h ..

//        ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka
//
//        l1.add(1);
//        l1.add(3);
//        l1.add(7);
//        l1.add(9);
//        l1.add(2);
//        l1.add(5);
//        l1.remove(2);
//        System.out.println();
//        for (int i=0;i< l1.size();i++){
//            System.out.println(l1.get(i));
//
//
//        }
//    }
//}

//set-->>> aap kiss index ki jgh kya dalna chahte ho yahi h set..
        ArrayList<Integer> l1 =new ArrayList<>(); // ye syntax h array list ko lane ka

        l1.add(1);
        l1.add(3);
        l1.add(7);
        l1.add(9);
        l1.add(2);
        l1.add(5);
        l1.set(2,7777); // yhan humne likh diya ki  hum 2 ki jgh 777 dalna chahte h..
        for (int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));


        }
        

    }
}