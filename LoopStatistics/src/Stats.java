import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stats {
    public static void main(String[] m) {

/*
        int counter = 0;
        Map<Integer, String> myMap = myMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (counter <12) {

            System.out.println("Gib mal monat in Zahl ein: ");
            int s = tryParseInt(sc.next());

            String monthname = monthInString(s,myMap);

            counter++;

        }
        sc.close();
        System.out.println("Gespeicherte Monate in der Map ");
        myMap.forEach((key,value) -> System.out.println(key+1 + " : " + value));

        int[] numbers = new int[myMap.size()];
        numbers = trimming(myMap);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/
        stundevom24mearz();
    }


    public static int[] trimming(Map<Integer, String> myMap) {

  //      myMap.forEach((key,value)-> value = value.strip());
        int length = myMap.size();
        String[] stringValues = new String[length];


        myMap.forEach((key,value) -> stringValues[length-1] = value);
        String[] numbers = new String[length];
        int i = 0;
        int[]numbersInInteger = new int[length];
        for (String s : stringValues) {
            Matcher m = Pattern.compile("\\d+").matcher(s);
            if (m.find()) {
                int number = Integer.parseInt(m.group());
                numbersInInteger[i] = number;
                i++;
            }
        }
        return numbersInInteger;

    }
    public static Integer tryParseInt(String s) {
        try {
            return Integer.parseInt(s);
        }catch(NumberFormatException e) {
            return null;
        }
    }
    public static String monthInString(int month, Map<Integer,String> map) {
        return switch (month) {
            case 1 -> {
                map.put(0, "January 31");
                yield "January";
            }
            case 2 -> {
                map.put(1, "February 28");
                yield "February";
            }
            case 3 -> {
                map.put(2, "March 31");
                yield "March";
            }
            case 4 -> {
                map.put(3, "April 30");
                yield "April";
            }
            case 5 -> {
                map.put(4, "May 31");
                yield "May";
            }
            case 6 -> {
                map.put(5, "June 30");
                yield "June";
            }
            case 7 -> {
                map.put(6, "July 31");
                yield "July";
            }
            case 8 -> {
                map.put(7, "August 31");
                yield "August";
            }
            case 9 -> {
                map.put(8, "September 30");
                yield "September";
            }
            case 10 -> {
                map.put(9, "October 31");
                yield "October";
            }
            case 11 -> {
                map.put(10, "November 30");
                yield "November";
            }
            case 12 -> {
                map.put(11, "December 31");
                yield "December";
            }
            default -> {
                map.put(0,"nahh");
                yield "Ungültiger Monat";
            }
        };
    }

    public static void stundevom24mearz(){

        int count = 0;
        int countsum = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Gib mal nummern ein: ");
            Integer s = tryParseInt(sc.next());

            if(s == null){
                System.out.println("Naahaahhaahh mann gimme Integers");
            }
            else if(s <=0){
                sc.close();
                System.out.println("Valid counters: " + count);
                System.out.println("Greatest number: " + max);
                System.out.println("Counters summed up: " + countsum);
                System.out.println("Programm is going to shutdown");
                System.exit(0);
            }else{
                if(s > max){
                    max = s;
                }

                count++;
                countsum = countsum + count;
            }
            System.out.println(s);

        }

    }
}
