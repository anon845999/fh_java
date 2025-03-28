//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Die Motorsteuerung einer ZZR 1400 nimmt laufend Datenpakete als float Zahlen entgegen und verarbeitet\n" +
                "diese. Ein Datenpaket darf höchstens 16 Werte beinhalten. Negative Werte bzw. Werte größer als 100\n" +
                "werden ignoriert und sind nicht Bestandteil eines Datenpaketes. Der Wert 0 beendet ein Datenpaket vorzeitig.\n" +
                "Wenn das Datenpaket eingelesen wurde, fragt die Motorsteuerung nach N und berechnet den Durschnittswert\n" +
                "der ersten N Werte. Sollten weniger als N Werte vorhanden sein, wird eine Fehlermeldung „Zu wenige\n" +
                "Werte“ ausgegeben.\n" +
                "Jede weitere Eingabe wird vom Programm ignoriert. Es endet nach spätestens 17 Eingaben.\n");


        System.out.println();

        Scanner sc = new Scanner(System.in);
        float zahl = 0F;
        int eingelesen = 0;
        float[]zahlen = new float[16];

        for (int i = 0; i < 16; i++) {
            System.out.println("Wert " + (i+1) + "eingeben: ");
            zahl = sc.nextFloat();
            if(zahl == 0){
                break;
            }
            if(zahl > 0 && zahl <= 100) {
                zahlen[i] = zahl;
                eingelesen++;
            }

        }
        System.out.println("Eingelesen: " + eingelesen);
        int n = 0;
        System.out.println("n eingeben: ");
        n = sc.nextInt();

        float sum_ohne_Division = 0.0F;

        if(n > eingelesen || n <= 0  ) {
            System.out.println("Zu wenig Werte für n");
        }else {
            for (int i = 0; i < n; i++) {
                sum_ohne_Division += zahlen[i];
            }
            float wert = sum_ohne_Division / n;
            System.out.printf("%.2f\n", wert);
        }



    }
}