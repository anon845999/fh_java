

import java.util.*;
import java.io.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public enum MILKTYPE{
        Leichtmilch_frisch,
        Extravollmilch_frisch,
        Normalmilch_frisch,
        Leichtmilch_haltbar,
        extravollmilch_haltbar,
        Normalmilch_haltbar,
    }

    public static void main(String[] args) {

        String milk = "";

            boolean aslongnotpossibleinputs = true;
            while (true) {
                try {
                    String input = null;
                    Scanner inputfromuser = new Scanner(System.in);
                    System.out.println("Bitte gebe den Fettgehalt der Milch ein:");

                    input = inputfromuser.nextLine();
                    int mfathelper = Integer.parseInt(input);


                    System.out.println("Bitte gebe die Haltbarkeit ein(0= Frisch, 1 = haltbaar) :");
                    input = inputfromuser.nextLine();
                    int mdurabilityhelper = Integer.parseInt(input);

                    if(mfathelper < 3 )
                    {
                        if(mdurabilityhelper == 0){
                            milk = MILKTYPE.Leichtmilch_frisch.toString();
                            aslongnotpossibleinputs = false;
                        }
                        if(mdurabilityhelper == 1){
                            milk = MILKTYPE.Leichtmilch_haltbar.toString();
                            aslongnotpossibleinputs = false;
                        }

                    }
                    if(mfathelper > 7){
                        if(mdurabilityhelper == 0){
                            milk = MILKTYPE.Extravollmilch_frisch.toString();
                            aslongnotpossibleinputs = false;
                        }
                        if(mdurabilityhelper == 1){
                            milk = MILKTYPE.extravollmilch_haltbar.toString();
                            aslongnotpossibleinputs = false;
                        }
                    }
                    if (mfathelper >=3  && mfathelper <=7) {
                        if(mdurabilityhelper == 0){
                            milk = MILKTYPE.Normalmilch_frisch.toString();
                            aslongnotpossibleinputs = false;
                        }
                        if(mdurabilityhelper == 1){
                            milk = MILKTYPE.Normalmilch_haltbar.toString();
                            aslongnotpossibleinputs = false;
                        }
                    }

                    if(!Objects.equals(milk, "") && aslongnotpossibleinputs == false){
                        break;
                    }
                }catch (Exception e) {
                    System.out.println("Falsche Eingabe pls wie im Beispiel eingeben");
                }

            }
        System.out.println(milk);

    }
}