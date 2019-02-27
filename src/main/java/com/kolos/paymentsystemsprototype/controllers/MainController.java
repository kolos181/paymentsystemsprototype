package com.kolos.paymentsystemsprototype.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/login")
    public String showMainPage() {
        return "login";
    }

    @RequestMapping("/order")
    public String showOrderPage() {
        return "OrderSummary";
    }

    @RequestMapping("/success")
    public String successfulOrder() {
        return "success";
    }

    @RequestMapping("/failure")
    public String faultyOrder() {
       return "failure";
    }
}
