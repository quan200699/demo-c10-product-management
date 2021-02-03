package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1,"IPhone 12", 1000000, "Like new"));
        products.put(2, new Product(2,"IPhone 11", 100000, "Like new"));
        products.put(3, new Product(3,"IPhone X", 1000, "Like new"));
        products.put(4, new Product(4,"IPhone 8", 10000, "Like new"));
        products.put(5, new Product(5,"IPhone 7", 100220000, "Like new"));
        products.put(6, new Product(6,"IPhone 6", 100001100, "Like new"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product save(Product product) {
        return products.put(product.getId(), product);
    }

    @Override
    public Product update(int id, Product product) {
        return products.replace(id, product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void deleteById(int id) {
        products.remove(id);
    }
}
