package jdbc_app.repository;


import jdbc_app.entity.SaleDetail;
import java.util.List;

public interface SaleDetailRepository {
    List<SaleDetail> findAll();
    boolean save(SaleDetail saleDetail);
    boolean update(SaleDetail saleDetail);
    boolean delete(long id);
    SaleDetail findById(long id);
    List<SaleDetail> findByName(String name);
}
