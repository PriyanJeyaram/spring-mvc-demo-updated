package com.bootcamp.springmvcdemoupdated.dao;

import com.bootcamp.springmvcdemoupdated.model.Product;
import com.bootcamp.springmvcdemoupdated.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


@Repository
public class ProductDAOImpl implements ProductDAO{

    JdbcTemplate template;

    private final String SQL_GET_ALL_PRODUCTS = "SELECT * FROM product";

    @Autowired
    public ProductDAOImpl(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Product> getAllProducts() {
        return template.query(SQL_GET_ALL_PRODUCTS, new ProductMapper());
    }
}
