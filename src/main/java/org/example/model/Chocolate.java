package org.example.model;

public class Chocolate extends ProductForSale{
    private int cocoaPercentage = 75;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " CocoaPercentage: " + cocoaPercentage);
    }
}
