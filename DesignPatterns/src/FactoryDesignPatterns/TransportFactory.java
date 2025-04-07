package FactoryDesignPatterns;

import SimpleFactoryPatterns.Transport;

public abstract class TransportFactory {

    public Transport transport(){
        System.out.println("Transport bitte beladen, in 5 minuten geht es los");
        Transport transport = factoryMethod();
        System.out.println("Transport wurde beladen");

        return transport;
    }

    public abstract Transport factoryMethod();



}
