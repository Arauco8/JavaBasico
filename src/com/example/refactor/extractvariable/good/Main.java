package com.example.refactor.extractvariable.good;

import com.example.refactor.extractvariable.bad.Order;

public class Main {

    void printProductPrice(Order order){
        // calcular precio total

        // 1. precio de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2. descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3. calcular precio productos con el descuento incluido
        Double finalPrice = quantityPrice - offerPrice;

        // 4. precio envio
        Double shippingCost = 0.0;
        if(finalPrice < 50){
            shippingCost = 2.99;
        }

        // precio definitivo
        System.out.println(finalPrice + shippingCost);
    }

}