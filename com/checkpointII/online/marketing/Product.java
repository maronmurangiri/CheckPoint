package com.checkpointII.online.marketing;

import java.util.HashMap;
import java.util.Map;

public class Product {
    Map<String, Double> productsMap = new HashMap<>();

    public void stockedProduct(){
        productsMap.put("Phone", 1000.00);
        productsMap.put("TV",2000.00);
        productsMap.put("remote",500.00);
        productsMap.put("microphone",1500.00);
    }
}
