package jdbc_app.repository;

import jdbc_app.entity.Customer;
import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
    boolean save(Customer customer);
    boolean update(Customer customer);
    boolean delete(long id);
    Customer findById(long id);
    List<Customer> findByName(String name);
}
