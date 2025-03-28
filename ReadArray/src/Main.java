import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the integer array: ");
        int size = sc.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + "Number: ");
            array[i] = sc.nextInt();
        }

        for (int i = array.length-1; i >=0; i--) {
            System.out.println(array[i]);
            if(i == 0){
                System.out.println("Output finished");
            }
        }
    }
}