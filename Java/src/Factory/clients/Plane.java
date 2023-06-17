package src.Factory.clients;

import src.Factory.IVehicle;

public class Plane implements IVehicle {
    @Override
    public void toTransport(String name) {
        System.out.println(name + " Have been transported by Plane");
    }
}
