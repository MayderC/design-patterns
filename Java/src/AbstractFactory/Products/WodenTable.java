package src.AbstractFactory.Products;

import src.AbstractFactory.AbstractProducts.ITable;

public class WodenTable implements ITable {


    @Override
    public void onEat() {
        System.out.println("Comiendo en mesa de madera");
    }
}
