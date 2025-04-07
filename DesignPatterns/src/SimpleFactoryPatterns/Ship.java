package SimpleFactoryPatterns;

public class Ship implements Transport {

    @Override
    public void createTransport() {
        System.out.println("Wir liefern über wasser. ");
    }
}
