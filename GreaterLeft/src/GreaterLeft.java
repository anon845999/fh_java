import java.util.*;

public class GreaterLeft{

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc  = new Scanner(System.in);
            int n = 0;
            while (true){
                System.out.println("Wieviele n Elemente ins array?: ");
                String input = sc.nextLine();
                n = tryParseInt(input);
                if(n != -1){
                    break;
                }
            }
            int[] arrayn = new int[n];
            int[] arraysecond = new int[n];


                int i = 0;
                int helper = 0;
                int counter = 0;
                try {
                    while (i != arrayn.length) {
                        System.out.println("Gib  " + i + " Element ein(beginnend bei 0 weil array)[nur für mike]: ");
                        helper = tryParseInt(sc.nextLine());
                        if (helper == -1) {
                            continue;
                        } else {
                            arrayn[i] = helper;
                        }
                        i++;
                    }
                    for (int j = 0; j < arrayn.length; j++) {
                        counter = 0;
                        if(j == 0){
                            arraysecond[j] = 0;
                        }else {
                            for (int k = 0; k < j; k++) {
                                if(arrayn[k] > arrayn[j]){

                                    counter++;
                                }
                            }
                            arraysecond[j] = counter;

                        }
                        // 2 for schleifen um überpüfen wieviele von links alle größer sind als i
                        //bzw als current iteration


                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            for (var g : arraysecond){
                System.out.print(g + " ");
            }
            System.out.println();
            for(var g : arrayn){
                System.out.print(g + " ");
            }
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            if(sc != null){
                sc.close();
            }else{
                System.out.println("Scanner is null -- cannot close scanner");
            }
        }
    }

    public static int tryParseInt(String input)throws NumberFormatException {
        try {
            return Integer.parseInt(input);
        }catch(NumberFormatException e) {
            System.out.println("kein Integer! ");
            return -1;
        }
    }
}
