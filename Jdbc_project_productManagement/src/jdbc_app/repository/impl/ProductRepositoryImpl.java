package jdbc_app.repository.impl;

import jdbc_app.entity.Product;
import jdbc_app.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Product findById(long id) {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
