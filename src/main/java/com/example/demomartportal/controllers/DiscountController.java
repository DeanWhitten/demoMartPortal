package com.example.demomartportal.controllers;

import com.example.demomartportal.models.Cart;
import com.example.demomartportal.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class DiscountController{

    private final DiscountService discountService;

    @Autowired
    public DiscountController(DiscountService discountService){
        this.discountService = discountService;
    }

    @PostMapping("/discount")
    public Cart getDiscount(@RequestBody Cart cart){
        return discountService.calculateDiscount(cart);
    }

}
