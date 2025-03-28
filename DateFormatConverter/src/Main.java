//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.math.*;



public class Main {
    public static void main(String[] args) {


        Scanner sc = null;
        String input = "";
        double day,month,year = 0.0;
        try {
            sc = null;
            while (true) {
                int length = 0;
                System.out.println("Gib mal YYYYmmdd ein, in genau dieser Schreibweise: ");
                sc = new Scanner(System.in);
                input = sc.nextLine();
                for (int i = 0; i <= input.length() - 1; i++) {
                    length++;
                }
                if (length == 8) {
                    break;
                }

            }
            StringBuilder sday = new StringBuilder();
            StringBuilder smonth = new StringBuilder();
            StringBuilder syear = new StringBuilder();
            int input_as_number = Integer.parseInt(input);
            for(int i = 0; i< input.length(); i++){
                if(i <= 3){
                    syear.append(input.charAt(i));
                }
                if(i>3 && i<=5){
                    smonth.append(input.charAt(i));
                }
                if(i>5){
                    sday.append(input.charAt(i));
                }
            }

            System.out.print(sday+"."+smonth+"."+syear);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}