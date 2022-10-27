package jdbc_app.service;


import jdbc_app.entity.Sales;
import java.util.List;

public interface SaleService {
    List<Sales> findAll();
    boolean save(Sales sales);
    boolean update(Sales sales);
    boolean delete(long id);
    Sales findById(long id);
    List<Sales> findByName(String name);
}
