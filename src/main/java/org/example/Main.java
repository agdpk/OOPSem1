package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();

        machine.addHotDrink(new HotDrinks("Name1", 3162, 13343));
        machine.addHotDrink(new HotDrinks("Name2", 3243, 343));
        machine.addHotDrink(new HotDrinks("Name3", 32, 33443));
        machine.addHotDrink(new HotDrinks("Name4", 322, 343));
    }
}