import objektorientierungw3schools.GenericMethod1;
import observerpattern.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        String[] strArray1 = {"test1", "test2", "test3", "test4"};
//        String[] strArray2 = {"test1", "test2", "test3", "test4"};
//        String[] strArray3 = {"test0", "test2", "test3", "test4"};
//
//        Integer[] intArray1 = {1, 2, 3, 4};
//        Integer[] intArray2 = {1, 2, 3, 4};
//        Integer[] intArray3 = {0, 2, 3, 4};
//
//        Double[] doubleArray1 = {1.1, 2.2, 3.3, 4.4};
//        Double[] doubleArray2 = {1.1, 2.2, 3.3, 4.4};
//        Double[] doubleArray3 = {0.0, 2.2, 3.3, 4.4};
//
//        GenericMethod1<Object> gm1 = new GenericMethod1<>(strArray1, strArray3, "test");
//
//        List<Number> list = new ArrayList<>();
//        for(int i = 0; i < 50; i++) {
//            list.add(i);
//            list.add(i +  0.01);
//        }
//
//
//        System.out.println(gm1.getFirstTargetElement(list, 20));
//

        Channel channel = new Channel();
        Subscriber subscriber1 = new Subscriber("Dan");
        Subscriber subscriber2 = new Subscriber("Towie");
        Subscriber subscriber3 = new Subscriber("Marschall");

        channel.subscriber(subscriber1);
        channel.subscriber(subscriber2);
        channel.subscriber(subscriber3);

        subscriber1.subscribe(channel);
        subscriber2.subscribe(channel);
        subscriber3.subscribe(channel);


        channel.upload("Hello World");



    }
}