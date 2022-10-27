package jdbc_app.service.impl;

import jdbc_app.entity.Customer;
import jdbc_app.repository.CustomerRepository;
import jdbc_app.repository.impl.CustomerRepositoryImpl;
import jdbc_app.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    public CustomerServiceImpl(){
        customerRepository = new CustomerRepositoryImpl();
    }
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean update(Customer customer) {
        return customerRepository.update(customer);
    }

    @Override
    public boolean delete(long id) {
        return customerRepository.delete(id);
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}
