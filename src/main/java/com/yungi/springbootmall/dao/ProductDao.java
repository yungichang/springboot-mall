package com.yungi.springbootmall.dao;

import com.yungi.springbootmall.dto.ProductRequest;
import com.yungi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProduct(Integer productId);
}
