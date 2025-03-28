import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Swapp to Variables with 3rd temporary variable");
        Object variable1  = null;
        Object variable2 = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first content");
        variable1 = sc.nextLine();
        System.out.println("Enter the second content");
        variable2 = sc.nextLine();

        System.out.println("Vaaribale 1: " + variable1);
        System.out.println("Vaaribale 2: " + variable2);

        Object variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;

        System.out.println("Vaaribale 1: " + variable1);
        System.out.println("Vaaribale 2: " + variable2);


    }
}