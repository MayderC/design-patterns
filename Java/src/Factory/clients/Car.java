package src.Factory.clients;

import src.Factory.IVehicle;

public class Car implements IVehicle {
    @Override
    public void toTransport(String name) {
        System.out.println("Transportando a: " + name);
    }
}
