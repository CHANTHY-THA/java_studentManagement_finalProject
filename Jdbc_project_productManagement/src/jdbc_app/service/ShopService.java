package jdbc_app.service;

import jdbc_app.entity.Shops;
import java.util.List;

public interface ShopService {
    List<Shops> findAll();
    boolean save(Shops shops);
    boolean update(Shops shops);
    boolean delete(long id);
    Shops findById(long id);
    List<Shops> findByName(String name);
}
