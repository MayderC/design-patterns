package src.Factory;

import src.Factory.clients.Car;
import src.Factory.clients.Plane;

public class Factory {
    public static IVehicle getTransport(String name) {
        switch (name) {
            case "Car" -> {
                return new Car();
            }
            case "Plane" -> {
                return new Plane();
            }
        }
        return new Car();
    }

}
