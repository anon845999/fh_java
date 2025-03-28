import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my BMI Calculator!");

        FileInputStream fis = null;
        FileOutputStream fos = null;


        File f = new File("..personen.json");


        Scanner sc = null;
        try {

            System.out.println("Pls tell me your name!: ");
            sc = new Scanner(System.in);
            String inputname = sc.nextLine();

            System.out.println("Pls tell me your age!: ");
            int age = sc.nextInt();

            System.out.println("Pls tell me your height!(it must be over 1.6m!: ");
            double height = 0.0;
            double helperheight = sc.nextDouble();
            if(helperheight > 1.6)
            {
                height = helperheight;
            }else {
                System.out.println("too low --> programm is shutting down");
                System.exit(0);
            }
            System.out.println("Pls tell me your weight!: ");
           double helperweight = sc.nextDouble();

            double weight = 0.0;
            if(helperweight > 40)
            {
                weight = helperweight;
            }else {
                System.out.println("too low --> programm is shutting down");
                System.exit(0);
            }

            Person p1 = new Person(inputname, age, height, weight);
            System.out.println("We are now calculating your BMI!: ");

            p1.setmBmi(bmiCalc(p1.getHeight(), p1.getWeight()));
            bmicalulations(p1);

           System.out.println(p1.toString());

           int input = 0;


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }


    }

    public static double bmiCalc(double height, double weight) {

         //bmi = kg / m² --> bmi = kg / (m*m)
        return weight / (height * height);
    }

    public static int bmiCategory(double bmi){
        return -1;
    }
    public static void bmiMessage(int bmiCategory){
 //maybe another time doing it like wished :DDD
    }

    public static void bmicalulations(Person p1){

        if(p1.getmBmi() < 15.00){
            p1.setCategory(Category.VERYSEVERELYUNDERWEIGHT);
            p1.setCategoryNumber(Category.CATEGORY1);
        }
        if(p1.getmBmi()  >= 15.00 && p1.getmBmi() <  16.00){
            p1.setCategory(Category.SEVERELYUNDERWEIGTH);
            p1.setCategoryNumber(Category.CATEGORY2);
        }
        if(p1.getmBmi()  >= 16.00 && p1.getmBmi() < 18.50){
            p1.setCategory(Category.UNDERWEIGHT);
            p1.setCategoryNumber(Category.CATEGORY3);
        }
        if (p1.getmBmi()  >= 18.50 && p1.getmBmi() < 25.00){
            p1.setCategory(Category.NORMAL);
            p1.setCategoryNumber(Category.CATEGORY4);
        }
        if(p1.getmBmi()  >= 25.00 && p1.getmBmi() < 30.00){
            p1.setCategory(Category.OVERWEIGHT);
            p1.setCategoryNumber(Category.CATEGORY5);
        }
        if(p1.getmBmi() >= 30.00 && p1.getmBmi() < 35.00){
            p1.setCategory(Category.MODERATLYOBSESE);
            p1.setCategoryNumber(Category.CATEGORY6);
        }
        if(p1.getmBmi() >= 35.00 && p1.getmBmi() < 40.00){
            p1.setCategory(Category.SEVERELYOBESE);
            p1.setCategoryNumber(Category.CATEGORY7);
        }
        if(p1.getmBmi() >= 40.00 ){
            p1.setCategory(Category.VERYSEVERELYOBESE);
            p1.setCategoryNumber(Category.CATEGORY8);
        }
    }



}