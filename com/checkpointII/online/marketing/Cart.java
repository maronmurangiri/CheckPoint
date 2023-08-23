package com.checkpointII.online.marketing;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<String,Double> productInCart = new HashMap<>();
    public void addProductToCart(String productName){
        Product product = new Product();

        if (product.productsMap.entrySet().contains(productName)){
            productInCart = (Map<String, Double>) product.productsMap.entrySet();
            Double totalPrice = productInCart.get(productName);
            System.out.println("Product "+ " costing "+ totalPrice+" added to cart");
        }
        else {
            System.out.println("The product is depleted");
        }
    }

    public static void main(String[] args){
        Cart cart = new Cart();
        cart.addProductToCart("Phone");
    }
}
