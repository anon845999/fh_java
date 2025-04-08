import java.io.*;

import HelperClass.CUserinput;
import csvstrategy.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the TournamentProgramm");
        System.out.println("In this Programm you are going to play with different");
        System.out.println("People on different tournaments");
        System.out.println("It is only allowed to choose one Tournament at the beginning when Person is created");
        System.out.println("Tournament will play again");

        CActualHandler readerwriter = new CActualHandler(new COpenICsvStrategy());
        readerwriter.handle("data.csv");


        CUserinput CUserinput = new CUserinput();





    }


}