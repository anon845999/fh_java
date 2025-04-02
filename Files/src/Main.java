import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String txtpath1 = "names.txt";
    public static final String txtpath2 = "other-names.txt";
    public static void main(String[] args) throws FileNotFoundException {




//        PrintingASpecificFile(songtext, userinput);
        TestFileDirectory();
        checkUserInputInFiles();

    }

    public static ArrayList<String> RandomStringList(Random rm) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(rm.nextInt(1, 100) + "");
        }
        return list;
    }

    public static String getTxtPath() {
        System.out.println("Gib mal das txt file ein: ");
        Scanner sc = new Scanner(System.in);
        String userinput = sc.nextLine();
        return userinput;
    }
    public static void checkUserInputInFiles(){
        ArrayList<String> guestlist1 = new ArrayList<>();
        ArrayList<String> guestlist2 = new ArrayList<>();
        ArrayList<String> guestlist_Combined = new ArrayList<>();

        try {
            GuestListFromFile(guestlist1,guestlist2);

            for(var item : guestlist1){
                guestlist_Combined.add(item);
            }
            for(var item : guestlist2){
                guestlist_Combined.add(item);
            }
            int counter = 0;
            Scanner sc = new Scanner(System.in);
            String userinput;
            while(counter != 10){
                System.out.println("Gib mal Namen ein: ");
                userinput = sc.nextLine();
                if(guestlist_Combined.contains(userinput)){
                    System.out.println("Dope ist enthalten");
                }else{
                    System.out.println("nahhh mannn");
                }
                counter++;
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }



    public static void GuestListFromFile(ArrayList<String> guestlist1, ArrayList<String>guestlist2) throws IOException {

        File myguestfile = new File(txtpath1);
        File myguestfile2 = new File(txtpath2);

        if(myguestfile.exists()) {

            try(BufferedReader br = new BufferedReader(new FileReader(myguestfile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    guestlist1.add((line));

                }
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }else
            if(!myguestfile.exists()) {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(myguestfile))){
                    bw.write("ada\narto\nleena\ntest");
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }


        if(myguestfile2.exists()) {
            try(BufferedReader br = new BufferedReader(new FileReader(myguestfile2))) {
                String line;
                while ((line = br.readLine()) != null) {
                    guestlist2.add((line));

                }
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }else if(!myguestfile2.exists()) {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(myguestfile2))){
                bw.write("leo\njarmo\nalicia");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }


    }


public static void TestFileDirectory(){
        File directory = new File("../");
        File[] files = directory.listFiles();
        for(File file : files){
            System.out.println(file.getName() + "    Pfad: " + file.getAbsolutePath());
            if(file.getName().endsWith("song.txt")){
                System.out.println("Song.txt ist enthalten " + file.getAbsolutePath());
            }
        }
}




}
