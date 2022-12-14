package jdbc_app.service;

import jdbc_app.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(long id);
    Product findById(long id);
    List<Product> findByName(String name);
}
