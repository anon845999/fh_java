package FactoryDesignPatterns;

import SimpleFactoryPatterns.Ship;
import SimpleFactoryPatterns.Transport;

public class ShipFactory extends TransportFactory {


    @Override
    public Transport factoryMethod() {
        return new Ship();
    }
}
