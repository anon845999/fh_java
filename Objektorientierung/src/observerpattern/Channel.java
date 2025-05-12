package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Subscriber> subs = new ArrayList<>();
    private String title;

    public void subscriber(Subscriber subscriber){
        subs.add(subscriber);
    }
    public void unsubscriber(Subscriber subscriber){
        subs.remove(subscriber);
    }

    public void notifySubscribers(){
        for(Subscriber subscriber : subs){
            subscriber.update();
        }
    }
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

}
