package jdbc_app.controller;

import jdbc_app.service.CustomerService;
import jdbc_app.service.impl.CustomerServiceImpl;

public class Customer {

    public static void main(String[] args) {
        CustomerService customerService = (CustomerService) new CustomerServiceImpl();
    }
}
