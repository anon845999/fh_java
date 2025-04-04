import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Random rand = new Random();

        System.out.println("how many integers in your array: ");
        Scanner sc = new Scanner(System.in);
        int n =  TryParseInt(sc.nextLine());

        BigInteger[] arr = new BigInteger[n];

        //filling the array with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = BigInteger.valueOf(rand.nextInt());
        }



        //----------------------------getting the infomation we want..............................//


        ArrayList<BigInteger> evenNumbers = new ArrayList<BigInteger>();
        ArrayList<Integer> indexOfEvenNumbers = new ArrayList<Integer>();

        //getting the indexes of even numbers in my array and storing evennumbers and index in array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                evenNumbers.add(BigInteger.valueOf(i));
                indexOfEvenNumbers.add(i);
                 // number of even numbers stored (counter)
            }
        }

        //writing out the indexcounter, how many even numbers do we have
        System.out.println("even numbers counter: " + indexOfEvenNumbers.size());

        //printing out the indexes of the even numbers from my array
        for(var item : indexOfEvenNumbers){
            int index = indexOfEvenNumbers.indexOf(item);
            System.out.println("even indexes: " + item);
        }

        //sum of the even numbers --> into BigInteger sumOfEvenNumbers = BigInteger.ZERO;
        BigInteger sumOfEvenNumbers = new BigInteger("0");
        for (var item : evenNumbers) {
            sumOfEvenNumbers = sumOfEvenNumbers.add(item);
        }


        //mean of the even numbers
        BigInteger meanOfEvenNumbers = BigInteger.ZERO;


            meanOfEvenNumbers = sumOfEvenNumbers.divide(BigInteger.valueOf(evenNumbers.size()));

        System.out.println("mean of even numbers: " + meanOfEvenNumbers);

        //value of the maximum even number


     //  BigInteger maxOfEvenNumbers = evenNumbers.isEmpty() ? null : evenNumbers.stream().max(BigInteger::compareTo).get();
        BigInteger maxOfEvenNumbers = Collections.max(evenNumbers);

       System.out.println("max of even numbers: " + maxOfEvenNumbers);

       //  (all) index position(s) of the maximum even number
        ArrayList<BigInteger> maxOfEvenNumbersList = new ArrayList<>();

        for (var item : evenNumbers) {
            if(item.equals(maxOfEvenNumbers)){
                maxOfEvenNumbersList.add(item);
                System.out.println("max of even numbers: " + maxOfEvenNumbersList);
            }
        }

        for(var item : indexOfEvenNumbers){
            System.out.println("indexes of the even max numbers " + item);
        }




    }

    public static int TryParseInt(String input){
        try{
            int n = Integer.parseInt(input);
            if(n>=0 && n<=1024){
                return n;
            }
            else{
                return 1024;
            }
        }catch(NumberFormatException e){
            return 1024;
        }
    }


}