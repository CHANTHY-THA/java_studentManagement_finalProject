package jdbc_app.service;


import jdbc_app.entity.Vendors;
import java.util.List;

public interface VendorService {
    List<Vendors> findAll();
    boolean save(Vendors vendors);
    boolean update(Vendors vendors);
    boolean delete(long id);
    Vendors findById(long id);
    List<Vendors> findByName(String name);
}
