package jdbc_app.service.impl;

import jdbc_app.entity.Product;
import jdbc_app.repository.ProductRepository;
import jdbc_app.repository.StockRepository;
import jdbc_app.repository.impl.ProductRepositoryImpl;
import jdbc_app.repository.impl.StockRepositoryImpl;
import jdbc_app.service.ProductService;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    public ProductServiceImpl(){
        productRepository = new ProductRepositoryImpl();
    }
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean update(Product product) {
        return productRepository.update(product);
    }

    @Override
    public boolean delete(long id) {
        return productRepository.delete(id);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
