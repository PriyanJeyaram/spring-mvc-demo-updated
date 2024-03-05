package com.bootcamp.springmvcdemoupdated.service;

import com.bootcamp.springmvcdemoupdated.dao.ProductDAO;
import com.bootcamp.springmvcdemoupdated.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDAO;

    @Override
    public List<Product> getAllProducts() {
//        List<Product> productList = Arrays.asList(
//                new Product(1001, "Scratch Pad", "Stationery", 35.40),
//                new Product(1001, "FlashLight", "Electronics", 575.65)
//        );

        List<Product> productList = productDAO.getAllProducts();

        return productList;
    }
}
