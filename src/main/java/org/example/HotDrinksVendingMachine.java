package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    private List<HotDrinks> hotDrinkList;


    @Override
    public void initProducts(List<Product> list) {
        this.hotDrinkList = new ArrayList<>();
    }

    @Override
        public Product getProduct(String name) {
            for (Product product : hotDrinkList) {
                if (name.equals(product.getName())) {
                    return product;
                }
            }
            return null;
        }

        public Product getProduct(String name, int volume, int temperature) {
            for (HotDrinks hotDrink : hotDrinkList) {
                if (hotDrink.getName().equals(name) &&
                        hotDrink.getTemperature() == temperature &&
                        hotDrink.getTemperature() == volume) {
                    return hotDrink;
                }
            }
            return null;
        }

        public void addHotDrink(HotDrinks hotDrink) {
            hotDrinkList.add(hotDrink);
        }
}
