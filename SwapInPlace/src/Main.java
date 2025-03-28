import javax.xml.crypto.Data;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        System.out.println("Welcome to SwapInPlace");
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter whatever U WANNA PUT INTO REVERSE array :D ");
        String input = sc.nextLine();

        String[] inputarray = input.split(" ");
        if(inputarray.length >0){
            CDataType<Object> Dataobject = new CDataType<>(inputarray);
          Dataobject.swapping();
        }else {
            System.out.println("Machmal neustart vom Programm und gib mehr als ein wert ein ");
        }


        System.out.println("End of Programm");


    }



}