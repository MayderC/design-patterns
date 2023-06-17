package src.AbstractFactory.Products;

import src.AbstractFactory.AbstractProducts.ISofa;

public class WodenSofa implements ISofa  {
    @Override
    public void onSit() {
        System.out.println("Estoy sentado en un sillon de madera");
    }
}
