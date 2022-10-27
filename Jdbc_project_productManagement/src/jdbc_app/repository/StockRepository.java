package jdbc_app.repository;


import jdbc_app.entity.Stock;
import java.util.List;

public interface StockRepository {
    List<Stock> findAll();
    boolean save(Stock stock);
    boolean update(Stock stock);
    boolean delete(long id);
    Stock findById(long id);
    List<Stock> findByName(String name);
}
