package SimpleFactoryPatterns;

public class Plane implements Transport {



    @Override
    public void createTransport() {
        System.out.println("Wir liefern über luft");
    }
}
