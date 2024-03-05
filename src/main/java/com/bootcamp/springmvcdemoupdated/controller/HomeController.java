package com.bootcamp.springmvcdemoupdated.controller;

import com.bootcamp.springmvcdemoupdated.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    ProductService service;

    @RequestMapping(method = RequestMethod.GET)
    public String greet(Model model) {
        var list = service.getAllProducts(); //calling the service from the controller
//        list.stream().forEach(System.out::println);
        model.addAttribute("productList", list);
        return "home";
    }
}
