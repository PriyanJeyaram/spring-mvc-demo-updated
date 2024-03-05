package com.bootcamp.springmvcdemoupdated.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();
        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setProductDesc(resultSet.getString("product_desc"));
        product.setProductPrice(resultSet.getFloat("product_price"));

        return product;
    }
}
