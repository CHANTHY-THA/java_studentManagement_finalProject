package jdbc_app.controller;

import jdbc_app.entity.Customer;
import jdbc_app.service.CustomerService;
import jdbc_app.service.impl.CustomerServiceImpl;

public class CustomerController {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();

        Customer customer = new Customer();
        customer.setName("Bunsal hul");
        customer.setPhone("0987654");
        customer.setAddress("Phnom Penh");
        customer.setCreateBy("Admin");
        customer.setUpdatedBy("Admin");


        if(customerService.save(customer)){
            System.out.println("Insert Successfully!");
        }else {
            System.out.println("Can not Insert!");
        }


    }
}
