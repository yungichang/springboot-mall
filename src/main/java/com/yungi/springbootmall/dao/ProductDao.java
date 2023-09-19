package com.yungi.springbootmall.dao;

import com.yungi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
