import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        a = 5;
        b = 6;
        c = a;
        double q,w,e;
        q = 1.;
        w = 2.;
        e = 3.;

        try {
           // IntegerCalculation(a,b,c);
          //  DoubleCalculations(q,w,e);
            geburtsdatum();



        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }

    }



    public static void UserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mal deine Namen ein: ");

        String name = sc.nextLine();
        int f = tryParse(name);


    }
    public static Integer tryParse(String s) throws NullPointerException{
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException ex) {
            return null;
        }
    }

    public static void IntegerCalculation(int a, int b, int c) throws ArithmeticException{
        System.out.printf("%d - %d = %d", a,b,a-b);
        System.out.println();
        System.out.printf("%d * %d = %d",a,b,a+b);
        System.out.println();
        System.out.printf("%d / %d = %d",a,b,a/b);
        System.out.println();


        System.out.printf("%d",Integer.MAX_VALUE +1);  //MAX_VALUE --> konstante (static final) != ENUM

    }

    public static void DoubleCalculations(double a, double b, double c) throws ArithmeticException{
        System.out.printf("%f ... %f",1.5D,1.D);
    }

    public static void geburtsdatum(){

        System.out.println("Gib mal  bitte Geburtstdaum (TTMMJJ) ein: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String year, month, day;
        day = "";
        month = "";
        year = "";
        if(input.length() == 6){
            day = input.substring(0,2);
            month = input.substring(2,4);
            year = input.substring(4,6);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(year);
        builder.append(month);
        builder.append(day);

        System.out.println(builder.toString());
    }


}