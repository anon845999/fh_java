import java.util.*;
import java.io.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Queue<Person> cash2 = new LinkedList<>();
        Queue<Person> cash1 = new LinkedList<>();
        Queue<Person> people = new LinkedList<>();



        try {
         //here I am gathering the number of people that wanna enque to pay
            gatherNumberofPeople(people);
        }catch (Exception e){
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);
        String input = "";

        boolean run = true;

        try {
            while (run) {

                for (Person p : people){
                    System.out.println(p.getName()+ " Warteschlange" );
                }
                for (Person p : cash1){
                    System.out.println(p.getName()+ " cash 1");
                }
                for (Person p : cash2){
                    System.out.print(p.getName() + " cash2");
                }

                System.out.println("What u wanna do ?:  (a == enque, 1 == from first cash done, 2 == from second cash done");
                input = sc.nextLine();
                Person p1;
                switch (input){
                    case "a":
                        if(people != null && cash1 != null && cash2 != null){
                            if(people.isEmpty()){
                                continue;
                            }else {
                                 p1 = people.poll();
                            }

                           if(cash1.size() < cash2.size()){
                               cash1.add(p1);
                           } else if (cash1.size() > cash2.size()) {
                               cash2.add(p1);
                           } else {
                               cash1.add(p1);
                           }
                        }
                        else{
                            System.out.println("lists r empty");
                        }
                        break;
                    case "1":
                        if(cash1.isEmpty()){
                            System.out.println("cash1 is empty");
                            continue;
                        }else {
                            cash1.remove();
                        }

                        break;
                    case "2":
                        if(cash2.isEmpty()){
                            System.out.println("cash2 is empty");
                            continue;
                        }else {
                            cash2.remove();
                        }
                        
                        break;
                    case "-":
                        System.out.println("Programm is going to shutdown");
                        System.exit(0);
                        break;
                    default:
                        continue;
                }
                if (cash1.isEmpty() && cash2.isEmpty()){
                    run = false;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gatherNumberofPeople(Queue<Person> people) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many people wanna enque? :");
        String numberofpeoplestring = sc.nextLine();
        int numberofpeople = Integer.parseInt(numberofpeoplestring);
        for (int i = 0; i < numberofpeople;i++){
            System.out.println("pls gimme the name of the next person ");
            String name = sc.nextLine();
            people.add(new Person(name));
        }
    }

}