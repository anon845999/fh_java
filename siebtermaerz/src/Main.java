//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            String input = sc.nextLine();
            double length = Integer.parseInt(input);
            double surfacearea = length * length *6;
            double volume = length * length * length;
            System.out.println(surfacearea + " " + volume);
            Date datum = new Date();


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public static void readScanner(){

    }
}