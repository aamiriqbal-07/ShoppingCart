package org.example.coupon;

import org.example.item.CartItem;

import java.util.List;

public class AmountOffNthCoupon implements Coupon {
    private final double amount;
    private final int nth;
    private final String type;
    private int count = 0;

    public AmountOffNthCoupon(double amount, int nth, String type) {
        this.amount = amount;
        this.nth = nth;
        this.type = type;
    }

    @Override
    public void apply(List<CartItem> cartItems) {
        for (CartItem item : cartItems) {
            if (item.getType().equals(type)) {
                count++;
                if (count == nth) {
                    item.applyAmountDiscount(amount);
                    break;
                }
            }
        }
    }
}
