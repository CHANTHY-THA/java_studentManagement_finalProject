package jdbc_app.repository;

import jdbc_app.entity.Vendors;
import java.util.List;

public interface VendorRepository {
    List<Vendors> findAll();
    boolean save(Vendors vendors);
    boolean update(Vendors vendors);
    boolean delete(long id);
    Vendors findById(long id);
    List<Vendors> findByName(String name);
}
