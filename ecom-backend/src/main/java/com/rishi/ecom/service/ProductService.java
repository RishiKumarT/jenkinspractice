package com.rishi.ecom.service;

import java.util.List;
import com.rishi.ecom.entity.Product;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product updateProduct(Product product);
    void deleteProductById(int id);
}
