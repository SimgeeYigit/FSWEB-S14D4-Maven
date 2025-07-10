package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        ProductForSale chocolate = new Chocolate("Tadelle", 105, "Fındıklı sütlü çikolata");
        ProductForSale bread = new Bread("Beyaz Ekmek", 110, "Taze beyaz ekmek");
        ProductForSale coke = new Coke("Coca Cola", 115, "Soğuk gazlı içecek");

        products[0] = chocolate;
        products[1] = bread;
        products[2] = coke;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}