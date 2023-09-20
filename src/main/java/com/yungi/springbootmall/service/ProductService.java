package com.yungi.springbootmall.service;

import com.yungi.springbootmall.dto.ProductRequest;
import com.yungi.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
}
