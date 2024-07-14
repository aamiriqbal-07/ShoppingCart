package org.example.coupon;

import org.example.item.CartItem;

import java.util.List;

public interface Coupon {
    void apply(List<CartItem> cartItems);
}