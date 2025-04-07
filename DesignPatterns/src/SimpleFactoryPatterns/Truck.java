package SimpleFactoryPatterns;

public class Truck implements Transport {

    @Override
    public void createTransport() {

        //for example
        System.out.print("Wir liefern über Land");
    }
}
