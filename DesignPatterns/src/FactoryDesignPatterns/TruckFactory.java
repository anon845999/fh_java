package FactoryDesignPatterns;


import SimpleFactoryPatterns.Transport;
import SimpleFactoryPatterns.Truck;

public class TruckFactory extends TransportFactory {


    @Override
    public Transport factoryMethod() {
        return new Truck();
    }
}
