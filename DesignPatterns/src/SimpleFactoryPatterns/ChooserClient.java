package SimpleFactoryPatterns;

import FactoryDesignPatterns.PlaneFactory;
import FactoryDesignPatterns.ShipFactory;
import FactoryDesignPatterns.TransportFactory;

public class ChooserClient {
    public void choose(){
//        Transport plane = TransportFactory.getTransport("SHIP");
//        plane.createTransport();
//        Transport truck = TransportFactory.getTransport("TRUCK");
//        truck.createTransport();
//
//        Transport ship = TransportFactory.getTransport("SHIP");
//        ship.createTransport();

        TransportFactory transportFactory = new PlaneFactory();
        Transport transport = transportFactory.transport();
        transport.createTransport();

        TransportFactory transportFactory2 = new ShipFactory();
        Transport transport2 = transportFactory2.transport();
        transport2.createTransport();




    }
}
