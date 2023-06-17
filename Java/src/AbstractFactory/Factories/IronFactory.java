package src.AbstractFactory.Factories;

import src.AbstractFactory.AbstractProducts.ISofa;
import src.AbstractFactory.AbstractProducts.ITable;
import src.AbstractFactory.IAbstractFactory;
import src.AbstractFactory.Products.IronSofa;
import src.AbstractFactory.Products.IronTable;

public class IronFactory implements IAbstractFactory {
    @Override
    public ISofa createSofa() {
        return new IronSofa();
    }
    @Override
    public ITable createTabale() {
        return new IronTable();
    }
}
