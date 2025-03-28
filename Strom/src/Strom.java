import java.util.*;
import java.util.stream.IntStream;

public class Strom {
    public static void main(String[] args) {

        // aus einfacheits gründen eine liste, --> Aufgabe fürs Wochenende:
        // selbstimplementierte liste !!!!

        List<Float> floatlist = new ArrayList<Float>();

        System.out.println("Ein elektronischer Stromzähler nimmt laufend Datenpakete als float Zahlen entgegen und verarbeitet diese.\n" +
                "Ein Datenpaket darf höchstens 16 Werte beinhalten. Werte kleiner als -100 bzw. Werte größer als 100\n" +
                "werden ignoriert und sind nicht Bestandteil eines Datenpaketes. Der Wert 999 beendet ein Datenpaket\n" +
                "vorzeitig. Wenn das Datenpaket eingelesen wurde, fragt die Anzeige nach dem Durchschnittswert der letzen N\n" +
                "Werte (Eingabe von N). Von den Werten wird nur der Betrag zur Durchschnittsbildung herangezogen. Sollten\n" +
                "weniger Werte vorhanden sein, wird die Fehlermeldung „Zu wenige Werte“ ausgegeben.\n" +
                "Jede weitere Eingabe wird vom Programm ignoriert. Es endet nach spätestens 17 Eingaben.");
        int counter = 0;
        float valuesum = 0.0f;
        int[] f = new int[23];

        Scanner sc = new Scanner(System.in);
        while(counter <= 16) {

            System.out.println("Gib den " + (counter+1) + " Wert ein , 999 beendet die loop: ");
            float value = tryParseFloat(sc.nextLine());
            if(Float.isNaN(value)){
                continue;
            }
/// noch ich fertig das beispiel, elbstimplementierte linkedlist würde sinn machen aber nicht in dem beispiel gewollt ^^

            if(value == 999 && counter == 1){
                System.out.println("zu wenig werte um zu beenden :D");
                continue;
            }

            if(value == 999 && counter > 1){
                break;
            }
            if(value >= -100 && value <= 100){
                counter++;
                floatlist.add(value);
                continue;
            }
            counter++;
        }
        System.out.println(floatlist.size());
        System.out.println("Eingelesen: " + counter);
        System.out.println("Gib mal die berechneten letzten n wert ein wieviel du berechnen moechtest: ");
        int n = tryParseIntUnsigned(sc.nextLine());
        int helpersize = 0;
        if(counter>1 && counter <=16){

             helpersize = floatlist.size() - n;
            for(int i = floatlist.size(); i > helpersize; i--){
                float unsigned = Math.abs(floatlist.get(i-1));
                valuesum += unsigned;
            }
        }else{
            System.out.println("Zu wenig eingetragene werte in der liste um das zu berechnen, oder zu groß :).");

        }

        System.out.println("Wert: " + valuesum /n);
        System.out.println("__________________________--");
    }

    public static float tryParseFloat(String str) {
        try {
            return Float.parseFloat(str);
        }
        catch (NumberFormatException e) {
            return Float.NaN;
        }
    }
    public static float tryParseFloatUnsigned (float f){
       try {
           return Math.abs(f);
       }catch (NumberFormatException e) {
           return Float.NaN;
       }
    }
    public static int tryParseIntUnsigned(String str) {
        try {
            return Integer.parseUnsignedInt(str);
        }catch (NumberFormatException ex){
            return -1;
        }
    }

    public static void test(){
        int[] f = new int[10];
        for(int i = 0; i<10; i++){
            f[i] = i*2;
        }
        int var1 = Arrays.stream(f).min().getAsInt();
        int var2 = Arrays.stream(f).max().getAsInt();

        System.out.println(var1 + " " + var2);
    }

}
