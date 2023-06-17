package src.AbstractFactory;

import src.AbstractFactory.Factories.IronFactory;
import src.AbstractFactory.Factories.WodenFactory;

public class FactoryOfFactories {

    public static IAbstractFactory getFactory(String name){

        return switch (name) {
            case "Wood" -> new WodenFactory();
            default -> new IronFactory();
        };

    }

}
