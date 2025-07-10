package org.example.model;

public class Coke extends ProductForSale{
    private int sugarGram = 75;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " sugarGram: " + sugarGram);
    }
}
