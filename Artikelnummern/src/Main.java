//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Artikelnummern eingabe");

        boolean schleife = true;
        while(schleife) {
            System.out.println("Gib mal artikelnummer ein: ");
            Scanner sc = new Scanner(System.in);
            int zahl = sc.nextInt();
            switch(zahl){
                case 1:
                    System.out.println("Getränk");
                    zahl = sc.nextInt();
                    switch(zahl){
                        case 1:
                            System.out.println("Bier");
                            zahl = sc.nextInt();
                            switch(zahl){
                                case 1:
                                    System.out.println("Bier (hell, 0,5)");
                                    break;
                                    case 2:
                                        System.out.println("Bier (hell, 0,33");
                                        break;
                                        case 3:
                                            System.out.println("Zwickel (0,5)");
                                            break;
                                            case 4:
                                                System.out.println("Zwickel (0,33)");
                                                break;
                                default:System.out.println("Falsche Eingabe");
                                    break;
                            }
                            break;
                            case 2:
                                System.out.println("Non-Alk");
                                zahl = sc.nextInt();
                                switch(zahl){
                                    case 1:
                                        System.out.println("Cola");
                                        break;
                                        case 2:
                                            System.out.println("Fanta");
                                            break;
                                    default: System.out.println("Falsche Eingabe");
                                        break;
                                }
                                break;
                                case 3:
                                    System.out.println("Wein");
                                    zahl = sc.nextInt();
                                    switch(zahl){
                                        case 1:
                                            System.out.println("Rotwein");
                                            break;
                                            case 2:
                                                System.out.println("Weißer Spritzer");
                                                break;
                                                default: System.out.println("Falsche Eingabe");

                                    }
                                    break;
                        default: System.out.println("Falsche Eingabe");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("Speisen ");
                    zahl = sc.nextInt();
                    switch(zahl){
                        case 1:
                            System.out.println("Klassisch");
                            zahl = sc.nextInt();
                            switch(zahl){
                                case 1:
                                    System.out.println("Schnitzel");
                                    break;
                                case 2:
                                    System.out.println("Schweinsbraten");
                                    break;
                                    default: System.out.println("Falsche Eingabe");
                            }
                            break;
                        case 2:
                            System.out.println("Kl. Speisen");
                            zahl = sc.nextInt();
                            switch(zahl){
                                case 1:
                                    System.out.println("Frankfurter");
                                    break;
                                    default: System.out.println("Falsche Eingabe");
                            }
                            break;
                        case 9:
                            System.out.println("Extra");
                            zahl = sc.nextInt();
                            switch(zahl){
                                case 1:
                                    System.out.println("Ketchup");
                                    break;
                                    default: System.out.println("Falsche Eingabe");
                            }
                            break;
                            default: System.out.println("Falsche Eingabe");
                    }
                    break;

                case 3:


                    System.out.println("Sonstiges");
                    zahl = sc.nextInt();
                    switch(zahl){
                        case 1:
                            System.out.println("Sonstiges");
                            zahl = sc.nextInt();
                            switch(zahl){
                                case 1:
                                    System.out.println("Zigaretten");
                                    break;
                                default:System.out.println("Falsche Eingabe");
                            }
                            break;
                            default: System.out.println("Falsche Eingabe");
                    }
                    break;
                default: System.out.println("wrong input");
                schleife = false;
                break;
            }

        }


    }

}