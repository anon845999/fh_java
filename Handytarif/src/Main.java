import com.sun.source.tree.WhileLoopTree;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       try{
           Scanner sc = null;

           boolean loop = true;

           int minuten = 0;
           int sms = 0;
           while(loop){


               System.out.println("Gib mal deine verbrauchten minuten ein: ");
               sc = new Scanner(System.in);

               minuten = sc.nextInt();

               System.out.println("Gib mal deine verbrauchten minuten ein: ");
               sms = sc.nextInt();

               if(minuten < 0){
                   System.out.println("Ungueltige Minuten");
                   continue;
               }
               if(sms < 0){
                   System.out.println("Ungueltige Smsen");
                   continue;
               }

               break;
           }

           float minutengebbuehren = calculateminutes(minuten);
           float smsgebuehren = calculatesms(sms);
           float beides = minutengebbuehren + smsgebuehren;

           System.out.println("Minuten: " + minutengebbuehren);
           System.out.println("SMS: " + smsgebuehren);
           System.out.println("Beides Zusammen(nicht auf nur 2 dezimalstellen formatiert: " + beides);
           System.out.printf("Formatiert %.2f\n", beides);

       }catch (Exception e){
           System.out.println(e);
       }



    }

    public static float calculateminutes (int lminuten){

        if(lminuten <= 100){
            return Tarife.GRUNDTARIF;
        }
        if(lminuten >= 101){
            int zusatz = lminuten - 100;
            return Tarife.GRUNDTARIF + (Tarife.ZUSAETZLICHETELEFONIE * zusatz);
        }
        return 0.0f;
    }
    public static float calculatesms(int lsms){

        if(lsms >= 1 && lsms <= 10){
            return lsms * 0.05f;
        }
        if(lsms >= 11 && lsms <= 20){
            return 0.5f + ((lsms-10) * 0.04f);
        }
        if(lsms >= 21 && lsms <= 50){
            return 0.9f + ((lsms-20) * 0.03f);
        }
        if(lsms >= 51 && lsms <= 100){
            return 1.80f + ((lsms-50) * 0.02f);
        }
        if(lsms >= 101 && lsms <= 1000){
            return 2.80f + ((lsms-100) * 0.01f);
        }
        if(lsms >= 1001){
            return 11.80f + ((lsms - 1000) * 0.005f);
        }
        return 0.0f;
    }
}