package com.d288.demo.controllers;

import com.d288.demo.services.CheckoutService;
import com.d288.demo.services.Purchase;
import com.d288.demo.services.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost4200")
@RestController
@RequestMapping("/api/checkout")

public class CheckoutController {
    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return checkoutService.placeOrder(purchase);
    }
}