package jdbc_app.service.impl;

import jdbc_app.entity.Product;
import jdbc_app.service.ProductService;
import java.util.List;

public class ProductServiceImpl implements ProductService {
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
