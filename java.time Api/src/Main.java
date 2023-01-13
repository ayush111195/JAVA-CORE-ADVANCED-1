import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//   1.  avilable from java & onwords
//   2. capable of storing ever nano seconds

//   there are a sume of the most usefull classss from java.time packeg...
//        LocalDate
//        LocalTime
//        LocalDateTime
//        DateTimeFormatter

        LocalTime t =LocalTime.now();// ye humko now ka time btayega ...
        System.out.println(t);

        LocalDate d=LocalDate.now(); // ye humko now ki date btayega ...
        System.out.println(d);

        LocalDateTime dt =LocalDateTime.now(); // ye humko now ka date and tym dono batayega...


        // datetimeformmatter--->>>

        LocalDateTime dt1=LocalDateTime.now(); // ye date and time btayega .. // this is date
        System.out.println(dt1);

        DateTimeFormatter   df =DateTimeFormatter.ofPattern("dd-mm-yyyy, h:m:s");  // this is the format

        String mydate=dt1.format(df);  // "dt1" date ko "df" format ki trh print karwaya gya h
        System.out.println(mydate);
    }
}