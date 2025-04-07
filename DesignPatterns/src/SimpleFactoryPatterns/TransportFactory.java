package SimpleFactoryPatterns;

public class TransportFactory {

    private static String SHIP = "SHIP";
    private static String TRUCK = "TRUCK";
    private static String PLANE = "PLANE";


    public static Transport getTransport(String type) {
        if(type.equals(SHIP)) {
            return new Ship();
        } else if(type.equals(TRUCK)) {
            return new Truck();
        } else if(type.equals(PLANE)) {
            return new Plane();
        } else {
            throw new IllegalArgumentException("Unbekannter Transport, typ nicht erkannt");
        }
    }
}
