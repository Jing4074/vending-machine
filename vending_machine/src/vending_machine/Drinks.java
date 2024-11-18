package vending_machine;

public class Drinks {
    
    private String name;
    private double price;
    private int quantity;
    private int sales;

    public Drinks(String name, double price, int quantity, int sales) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sales = sales;
    }
}
