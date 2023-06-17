package src.AbstractFactory.Factories;

import src.AbstractFactory.AbstractProducts.ISofa;
import src.AbstractFactory.AbstractProducts.ITable;
import src.AbstractFactory.IAbstractFactory;
import src.AbstractFactory.Products.WodenSofa;
import src.AbstractFactory.Products.WodenTable;

public class WodenFactory implements IAbstractFactory {

    @Override
    public ISofa createSofa() {
        return new WodenSofa();
    }

    @Override
    public ITable createTabale() {
        return new WodenTable();
    }
}
