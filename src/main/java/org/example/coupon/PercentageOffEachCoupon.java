package org.example.coupon;

import org.example.item.CartItem;

import java.util.List;

public class PercentageOffEachCoupon implements Coupon {
    private final double percentage;

    public PercentageOffEachCoupon(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void apply(List<CartItem> cartItems) {
        for (CartItem item : cartItems) {
            item.applyDiscount(percentage);
        }
    }
}