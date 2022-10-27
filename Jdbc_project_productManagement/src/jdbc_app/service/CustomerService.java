package jdbc_app.service;


import jdbc_app.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    boolean save(Customer customer);
    boolean update(Customer customer);
    boolean delete(long id);
    Customer findById(long id);
    List<Customer> findByName(String name);
}
