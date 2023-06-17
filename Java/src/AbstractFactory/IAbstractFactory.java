package src.AbstractFactory;

import src.AbstractFactory.AbstractProducts.ISofa;
import src.AbstractFactory.AbstractProducts.ITable;

public interface IAbstractFactory {
    ISofa createSofa();
    ITable createTabale();
}
