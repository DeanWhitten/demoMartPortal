package com.example.demomartportal.services;


import com.example.demomartportal.models.Cart;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class DiscountService {

 public  Cart calculateDiscount (Cart cart){
        BigDecimal percentage = BigDecimal.valueOf(0.25);

        BigDecimal subtotal = cart.getSubtotal();
        BigDecimal discount = subtotal.multiply(percentage);
        cart.setDiscount(discount);

        return cart;
 }

}