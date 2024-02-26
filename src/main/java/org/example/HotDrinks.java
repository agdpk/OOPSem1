package org.example;

public class HotDrinks extends Product{

    private int temperature;
    public HotDrinks(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
