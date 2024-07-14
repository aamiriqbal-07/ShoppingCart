package org.example.item;

public class CartItem {
    private final String type;
    private double price;
    private boolean discounted = false;

    public CartItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
        discounted = true;
    }

    public void applyAmountDiscount(double amount) {
        price -= amount;
        discounted = true;
    }

    @Override
    public String toString() {
        return type + ": $" + price;
    }
}
