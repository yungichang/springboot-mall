package com.yungi.springbootmall.service.impl;

import com.yungi.springbootmall.dao.ProductDao;
import com.yungi.springbootmall.dto.ProductRequest;
import com.yungi.springbootmall.model.Product;
import com.yungi.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
