package com.nmerris.basicinvoiceapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// This is a test app that uses routes to direct web traffic
// to specified methods using the Spring framework and Thymeleaf


@Controller
public class MainController {


    @GetMapping("/index")
    public @ResponseBody String indexPage() {
        return "<h1>Welcome to the basic invoice web app<h1>";
    }


    @GetMapping("/login")
    public @ResponseBody String loginPage() {
        return "This is the login page";
    }


    @GetMapping("/addproduct")
    public @ResponseBody String addProduct() {
        return "Add a product here";
    }


    @RequestMapping("/listproducts")
    public String listProducts(Model model) {
        String dependecyList = "The dependencies used are: spring-boot-starter-web, spring-boot-starter-test, spring-boot-starter-thymeleaf";

        model.addAttribute("productlistheading", "This is a list of your products");
        model.addAttribute("dependencylist", dependecyList);

        return "listproducts";
    }


}
