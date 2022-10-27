package jdbc_app.repository.impl;

import jdbc_app.entity.Customer;
import jdbc_app.repository.CustomerRepository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
