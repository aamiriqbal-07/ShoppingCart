package org.example;

import org.example.cart.ShoppingCart;
import org.example.coupon.AmountOffNthCoupon;
import org.example.coupon.PercentageOffEachCoupon;
import org.example.coupon.PercentageOffNextCoupon;
import org.example.item.CartItem;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("postcard sorter", 10));
        cart.addCoupon(new AmountOffNthCoupon(2, 2, "postcard sorter"));
        cart.addCoupon(new PercentageOffEachCoupon(25));
        cart.addCoupon(new PercentageOffNextCoupon(10));
        cart.addItem(new CartItem("postcard sorter", 10));

        System.out.println(cart);
    }
}