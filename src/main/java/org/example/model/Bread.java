package org.example.model;

public class Bread extends ProductForSale{
    private String flourType = "White";

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " flourType: " + flourType);
    }
}
