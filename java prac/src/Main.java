//import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(1) reverse the string -->>

       String a = "1,2,3,4,5,6,7";
        System.out.println(a.length());
        String reverseofa = "";
        String temp;
        for (int i = a.length() - 1; i >= 0; i--) {
            reverseofa = reverseofa + a.charAt(i);

        }
        System.out.println(reverseofa);


//(2.) java program to check whether two string are anagram or not?==>>

        // ex- abcd     and cdba  are   anaggram --

        String a1 = "abcd";
        String b1 = "cdab";
        char x[] = a1.toCharArray();
        char y[] = b1.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        Boolean resslut = Arrays.equals(x, y);
        if (resslut == true) {
            System.out.println("anagram");
        } else {
            System.out.println("not a anagram");
        }

// (14.)coping one string into another string ==>>

        String xy = " this is my java ";
        char[] newarr = xy.toCharArray();
        int size = xy.length();
        char ay[] = new char[size];
        for (int i = 0; i <= size - 1; i++) {
            ay[i] = newarr[i];

        }
        System.out.println(newarr);
        System.out.println(ay);

// (3.)check the given string is palindroms or not -->>

        String palindroms = " radar";
        String revers = "";
        for (int i = palindroms.length() - 1; i >= 0; i--) {
            revers = revers + palindroms.charAt(i);
        }
        System.out.println(revers);
        Boolean resultofp = (palindroms.equals(revers));

        if (resultofp = true) {
            System.out.println(" it is palindroms");

        } else {
            System.out.println("it is not palindroms");

        }

//  (4.)find the vowels , conssonants ,&special char  in string --->>>


        String ayush = "AYUSHGUPTA@#$%&";
        char ayus[] = ayush.toCharArray();
        int size1 = ayush.length();
        int vcount = 0;
        String vcount1 = "";
        int ccount = 0;
        String ccount1 = "";
        int scharcount = 0;
        String scharcount1 = "";
        for (int i = 0; i <= ayus.length - 1; i++) {
            if (ayus[i] >= 'A' && ayus[i] <= 'Z') {
                if (ayus[i] == 'A' || ayus[i] == 'I' || ayus[i] == 'O' || ayus[i] == 'U' || ayus[i] == 'E') {
                    vcount++;
                    vcount1 = vcount1 + ayus[i];
                } else {
                    ccount++;
                    ccount1 = ccount1 + ayus[i];
                }
            } else {
                scharcount++;
                scharcount1 = scharcount1 + ayus[i];
            }
        }
        System.out.println(" vcount==" + vcount);
        System.out.println(" ccount==" + ccount);
        System.out.println(" scharcount==" + scharcount);
        System.out.println("vcount1==" + vcount1);
        System.out.println("ccount1==" + ccount1);
        System.out.println("scharcount1==" + scharcount1);

        //   How to swap two numbers without using a third variable?-->>
        int a2 = 20;
        int b3 = 30;

        b3 = b3 + a2;
        a2 = b3 - a2;
        b3 = b3 - a2;
        System.out.println("a2 " + a2);
        System.out.println("b3 " + b3);

// (5.)Java program to check if the given number is Prime?-->>

        int prime = 8;
        int temp1 = 0;

        for (int i = 2; i <= prime - 1; i++) {
            if (prime % i == 0) {
                temp1++;
            }

        }

        if (temp1 >= 1) {
            System.out.println(" not prime no");
        } else {
            System.out.println(" this is a prime number ");
        }

// (6.)  How to remove Whitespaces from String-->>

        String ayush1 = "ayu sh gu pta";
        char[] white = ayush1.toCharArray();
        String temp3 = " ";
        for (int i = 0; i <= white.length - 1; i++) {
            //method 1-->>

            if (white[i] != ' ') {
                temp3 = temp3 + white[i];
            }

        }
        System.out.println(temp3);

        //  method -->>3
        String str = ayush1.replaceAll(" ", "");
        System.out.println(str);

//  (7.)print array in reverse  order -->>

        int[] reverse = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = reverse.length;
        int n = Math.floorDiv(l, 2);

        int trmp;
        for (int i = 0; i <= n - 1; i++) {
            trmp = reverse[i];
            reverse[i] = reverse[l - i - 1];
            reverse[l - i - 1] = trmp;
        }
        for (int i2 = 0; i2 <= reverse.length - 1; i2++) {
            System.out.println(reverse[i2]);
        }

//(8.)factorical -->>>

        int i6 = 1;
        Scanner gupta = new Scanner(System.in);
        System.out.println(" enter the no==");
        int i3 = gupta.nextInt();
        for (int i = 1; i <= i3; i++) {
            i6 = i6 * i;

        }
        System.out.println(i6);

//(9.)Armstrong number--->>>

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the num=");
        int ar = scan.nextInt();
        int t1 = ar;
        int length = 0;
        while (t1 != 0) {
            length = length + 1;
            t1 = t1 / 10;
        }
        System.out.println(" length==" + length);

//(10.) how  to  genrate rendom no in java ---->>

        System.out.println("first rendom num in java " + Math.random());
        System.out.println("2nd rendom num in java " + Math.random());

//(11.) how to print pattern in java--->>


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i == 1 && j >= 5) || (i == 9 && j <= 5) || i == 5 || (j == 1 && i <= 5) || (j == 9 && i >= 5) || j == 5) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

//(12.)  how to revers a num in java--->>

        int revnum = 12345;
        String str2 = " ";
        String str1 = Integer.toString(revnum);
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);

// (13.)   how to convert num into the  word--->>

        int covnum = 12345;


//(15.)copy all element of one array into another array--->>

        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8};

        int arrayss[] = new int[arrays.length];
        for (int i = 0; i <= arrays.length - 1; i++) {
            arrayss[i] = arrays[i];


        }

        for (int i = 0; i <= arrayss.length - 1; i++) {
            System.out.println(arrayss[i]);
        }
        // 2nd methood -->>
//     int [] arrayss=arrays.clone();
//        for (int i=0;i<=arrays.length-1;i++){
//            System.out.println("arrays=="+arrays[i]);
//        }
//        for (int i=0;i<=arrayss.length-1;i++){
//            System.out.println("arrays=="+arrayss[i]);
//        }

// (16.)find the frequency of each element in the array---->>>

        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println(array.length);


//(17.) java program to left rotate the elements the elements of an array--->>

        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);

        }

// (18.)print  the element of ann array ---->>

        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.println(array2[i]);

        }

//(19.)java program to print the element of an array in revers order--->>

        int array3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.println(array3[i]);

        }
//(20.) java program to print the element of an array in even position --->>

        int array4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= array4.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(array4[i]);

            }

        }
//(21.) java program to print the element of an array in odd position --->>

        int array5[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= array5.length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println(array5[i]);

            }

        }
//(22.) java program to print the largest element of an array --->>

        int array6[] = {4, 2, 3, 7, 9, 8};
        System.out.println(array6.length);
        int min = 0;
        for (int i = 0; i <= array6.length - 1; i++) {
            if (array6[i] > min) {
                min = array6[i];
            }
        }
        System.out.println("maximum==" + min);

//(23.) java program to print the shorting  of an array --->>

        int[] array12 = {38, 52, 9, 18, 6, 62, 13};
        System.out.println(array12.length);
        int temp6;
        for (int i16 = 0; i16 < array12.length; i16++) {
            for (int j = 0; j < array12.length - 1 - i16; j++) {
                if (array12[j] > array12[j + 1]) {
                    temp6 = array12[j];
                    array12[j] = array12[j + 1];
                    array12[j + 1] = temp6;
                }

            }

        }
        for (int i16 = 0; i16 < array12.length; i16++) {
            System.out.println("the series" + array12[i16]);
        }
        // 2nd method-->>>

        Arrays.sort(array12);
        for (int i = 0; i <= array12.length - 1; i++) {
            System.out.println("array shorting " + array12[i]);
        }

//(24.) java program to print the largest element of an array --->>

        int[] array11 = {38, 52, 9, 18, 6, 62, 13};
        int minimum = 1223;
        for (int i = 0; i < array12.length; i++) {
            if (array11[i] < minimum) {
                minimum = array11[i];
            }
        }
        System.out.println("the minimum num==" + minimum);

//(25.) java program to print the sum of all element --->>

        int[] array10 = {38, 52, 9, 18, 6, 62, 13};
        int sum = 0;
        for (int i = 0; i < array10.length; i++) {
            sum = sum + array10[i];
        }
        System.out.println("sum of the array ==" + sum);

// (26.) java program to right rotate the element of an array --->>

        int[] array9 = {38, 52, 9, 18, 6, 62, 13};
        for (int i = array9.length - 1; i >= 0; i--) {
            System.out.println(array9[i]);
        }

//(27.) java program to short the element of an array in asending order--->>

        int[] array22 = {38, 52, 9, 18, 6, 62, 13};
        int temp11;
        for (int i16 = 0; i16 < array22.length; i16++) {
            for (int j = 0; j < array22.length - 1 - i16; j++) {
                if (array22[j] > array22[j + 1]) {
                    temp11 = array22[j];
                    array22[j] = array22[j + 1];
                    array22[j + 1] = temp11;
                }
            }
        }
        for (int i16 = 0; i16 < array12.length; i16++) {
            System.out.println("the series of asending order ==" + array12[i16]);
        }

//(28.) java program to short the element of an array in disending order--->>

        int[] array7 = {38, 52, 9, 18, 6, 62, 13};

        int temp13;
        for (int i16 = 0; i16 < array7.length; i16++) {
            for (int j = 0; j < array7.length - 1 - i16; j++) {
                if (array7[j] < array7[j + 1])
                {
                    temp13 = array7[j + 1];
                    array7[j + 1] = array7[j];
                    array7[j] = temp13;
                }

            }

        }
        for (int i16 = 0; i16 < array7.length; i16++) {
            System.out.println("the series of disending order ==" + array7[i16]);
        }


//(29.) java program to find the 3rd largest number in array--->>

        int[] array16 = {3, 5, 8, 4, 6, 7};
        Arrays.sort(array16);
        int[] array15 = new int[array16.length];

        for (int i22 = 0; i22 <= array16.length - 1; i22++) {
            array15[array16.length - 1 - i22] = array16[i22];
        }
        for (int i21 = 0; i21 <= array15.length - 1; i21++) {
          //  System.out.println(array15[i21]); // array5 print ho rha h.. ismain humne array 6 ko store kiya h revers order main
        }
        System.out.println("3rd largest num===" + array15[2]);

//(30.) java program to find the 2nd largest number in array--->>

        int[] array17 = {3, 5, 8, 4, 6, 7};
        Arrays.sort(array17);
        int[] array18 = new int[array17.length];

        for (int i22 = 0; i22 <= array17.length - 1; i22++)
        {
            array18[array17.length - 1 - i22] = array17[i22];
        }
        for (int i21 = 0; i21 <= array18.length - 1; i21++)
        {
         //   System.out.println(array18[i21]); // array5 print ho rha h.. ismain humne array 6 ko store kiya h revers order main
        }
        System.out.println("2nd largest num===" + array18[1]);

// (31.) find largest num of an  array --->>
        // plzz see question num ==22

//(32) java program to add two matrices--->>

        int[][] array122 = {{1, 2 }, {8, 9}};
        int[][] array13 = {{1, 2}, {8, 9}};
        int[][] sum2 = new int[2][2];
        for (int i = 0; i <=array13.length-1; i++)
         {
            for (int j = 0; j <=array13.length-1; j++)
             {
                sum2[i][j] = array122[i][j] + array13[i][j];
            }
        }
        System.out.println(" the sum of array==>");
        for (int i = 0; i <= sum2.length-1; i++) {
            for (int j = 0; j <=sum2.length-1; j++)
            {
                System.out.print(sum2[i][j]+" ");
            }
            System.out.println();
        }
//(33) java program to subtract  two matrices--->>

        int[][] array26 = {{1, 2,4 }, {8, 9,5},{5,7,9}};
        int[][] array27 = {{1, 2,7}, {8, 9,6},{3,7,9}};
        int[][] subtract= new int[3][3];
        for (int i = 0; i <=array26.length-1; i++)
         {
            for (int j = 0; j <=array26.length-1; j++)
             {
                subtract[i][j] = array26[i][j] - array27[i][j];
            }
        }
        System.out.println(" the subtract of array==>");
        for (int i = 0; i <= subtract.length-1; i++)
        {
            for (int j = 0; j <=subtract.length-1; j++)
             {
                System.out.print(subtract[i][j]+" ");
            }
            System.out.println();
        }

//(34.)  java program to multiply two matrices--->>

        int[][] array36 = {{1, 2,4 }, {8, 9,5},{5,7,9}};
        int[][] array37 = {{1, 2,7}, {8, 9,6},{3,7,9}};
        int[][] multiply= new int[3][3];
        for (int i = 0; i <=array36.length-1; i++)
        {
            for (int j = 0; j <=array36.length-1; j++)
             {
                multiply[i][j] = array36[i][j] * array37[i][j];
            }
        }
        System.out.println(" the subtract of array==>");
        for (int i = 0; i <= multiply.length-1; i++)
         {
            for (int j = 0; j <=multiply.length-1; j++)
            {
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }

// (35.)java program to determine whether two matrices are equal---->>

//      int[][] array46 = {{1, 2, 4}, {8, 9, 5}, {5, 7, 9}};
//      int[][] array47 = {{1, 2, 7}, {8, 9, 6}, {3, 7, 9}};
        int[][] array46 = {{0, 0, 0}, {0, 0, 0}, {1, 2, 3}};
        int[][] array47 = {{0, 0, 0}, {0, 0, 0}, {1, 2, 3}};
        int count=0;
        for (int i = 0; i <= array46.length - 1; i++)
        {
            for (int j = 0; j <= array46.length - 1; j++)
            {
                if (array46[i][j] != array47[i][j])
                {
                    count++;
                }
            }
        }
                if (count>=1)
                {
                    System.out.println("this is not a equal matrices ");
                }
                else
                {
                    System.out.println(" this is a equal matrices");
                }
//(36.)java program to display  the lower triangular  matrices---->>

        int[][] array49 = {{1, 2, 4}, {8, 9, 5}, {5, 7, 9}};
        System.out.println(" lower triangular  matrices---->>");
                for (int i=0;i<=array49.length-1;i++)
                {
                    for (int j=0;j<=array49.length-1;j++)
                    {
                        if (i>j)
                        {
                            System.out.print(array49[i][j]+" ");
                        }
                    }
                    System.out.println();
                }

//(37.)java program to display  the lower triangular  matrices---->>

        int[][] array50 = {{1, 2, 4}, {8, 9, 5}, {5, 7, 9}};
        System.out.println(" upper  triangular  matrices---->>");
        for (int i=0;i<=array50.length-1;i++)
        {
            for (int j=0;j<=array50.length-1;j++)
            {
                if (i<j)
                {
                    System.out.print(array50[i][j]+" ");
                }
            }
            System.out.println();
        }
//(38.)java program to divide a string in "n" equal parts---->>


//(39.)java program to find  all subsets of a string ---->>


//(42.) java program to relplace all white spacees of a string--->>
             // plzz see question no --7

//(43.) replace all lower case char int to the upper case--->>
        String ayush11="ayushgupta";
        System.out.println(ayush1.toUpperCase());

//(44.) replace all spaces of a string with a specific charecter --->>

        String ayush2="ay us hgu pt a";
        System.out.println(ayush2.replace(" ", "!"));

//(45.) java porgram  to determine whether a string is a palindrome  --->>
                   //plzz see the question no 3---

//(46.) java porgram  to find the maximum and minimum occurring character in a string  --->>

//(47.) java porgram  to find the duplicate character in a string  --->>

        String s1="aayusssh ";
        int power1;


        char []words1 =s1.toCharArray();

        for (int i=0;i<words1.length;i++)

        {
            power1=1;
            for (int j=1+i;j<words1.length;j++)
            {
                if(words1[i]==(words1[j]))
                {
                    power1++;
                    words1[j]=0;
                }

            }
            if (power1>1&&words1[i]!=0)
            {
                System.out.println(" repeted  of string == "+words1[i]);

            }

        }

//(48.) java porgram  to find the reverse of  a string  --->>

        String gu=" ayush ";
        String pt=" ";
        for (int i=gu.length()-1;i>=0;i--)
        {
            pt=pt+gu.charAt(i);
        }
        System.out.println(pt);

// (49.)java program to determine whether one string is rotaion of author or not --->>
        String gup = "ayush";
        String pta = "hsuya";
        // String gup1=" ";
        String pta1 = "";

        for (int i = pta.length() - 1; i >= 0; i--) {


            pta1 = pta1 + pta.charAt(i);
        }
        System.out.println(pta1);

        if (gup.equals(pta1)){
            System.out.println(" this is  a revers string ");
        }
        else {
            System.out.println("this is not a revers string ");
        }

// (50.)java program to find duplicate word in the string  --->>

        String s="Learn Java Science Learn Api Teachinng ";
        int power;
        s=s.toLowerCase();
        System.out.println(" string="+s);  // print the string
        String []words =s.split(" ");
        for (int i=0;i<words.length;i++){
        System.out.println("array is -->"+words[i]);}        // print the arrays ..
        for (int i=0;i<words.length;i++)

        {
            power=1;
            for (int j=1+i;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    power++;
                    words[j]="0";
                }

            }
            if (power>1&&words[i]!="0")
            {
                System.out.println(" repeted words of string == "+words[i]);

            }

        }


    }
}



