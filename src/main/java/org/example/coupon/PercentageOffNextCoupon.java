package org.example.coupon;

import org.example.item.CartItem;

import java.util.List;

public class PercentageOffNextCoupon implements Coupon {
    private final double percentage;
    private boolean applied = false;

    public PercentageOffNextCoupon(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void apply(List<CartItem> cartItems) {
        if (!applied) {
            for (CartItem item : cartItems) {
                if (!item.isDiscounted()) {
                    item.applyDiscount(percentage);
                    applied = true;
                    break;
                }
            }
        }
    }
}
