public class Main {
    public static void main(String[] args) {
      //  how java stored date and tym-->>
      //   this long number hold thenumber of miliseconds passed since" 1jan 1970";
        System.out.println(System.currentTimeMillis()); // ye humko bta  rha h ki 1970 se ab tak kitne milisec nikal chuke h
        System.out.println(System.currentTimeMillis()/1000); //ye humko bta  rha h ki 1970 se ab tak kitne sec nikal chuke h
        System.out.println(System .currentTimeMillis()/1000/3600);// ye humko bta  rha h ki 1970 se ab tak kitne min nikal chuke h
        System.out.println(System.currentTimeMillis()/1000/3600/24);//ye humko bta  rha h ki 1970 se ab tak kitne din nikal chuke h
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);//ye humko bta  rha h ki 1970 se ab tak kitne year nikal chuke h
    }
}