package FactoryDesignPatterns;


import SimpleFactoryPatterns.Plane;
import SimpleFactoryPatterns.Transport;

public class PlaneFactory extends TransportFactory{


    @Override
    public Transport factoryMethod() {//über die methodenparamter könnt eich dann if then else abfragen machen bzgl welches genau erstellt werden soll
        return new Plane();

    }
}
