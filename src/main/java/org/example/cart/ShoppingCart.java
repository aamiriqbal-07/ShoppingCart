package org.example.cart;

import org.example.coupon.Coupon;
import org.example.item.CartItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Object> sequence = new ArrayList<>();

    public void addItem(CartItem item) {
        sequence.add(item);
    }

    public void addCoupon(Coupon coupon) {
        sequence.add(coupon);
    }

    public double calculateTotal() {
        List<CartItem> cartItems = new ArrayList<>();
        for (Object obj : sequence) {
            if (obj instanceof CartItem) {
                cartItems.add((CartItem) obj);
            } else if (obj instanceof Coupon) {
                ((Coupon) obj).apply(cartItems);
            }
        }

        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shopping Cart:\n");
        for (Object obj : sequence) {
            sb.append(obj.toString()).append("\n");
        }
        sb.append("Total: $").append(calculateTotal()).append("\n");
        return sb.toString();
    }
}
