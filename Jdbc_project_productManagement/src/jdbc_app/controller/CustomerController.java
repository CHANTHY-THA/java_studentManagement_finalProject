package jdbc_app.controller;

import jdbc_app.entity.Customer;
import jdbc_app.service.CustomerService;
import jdbc_app.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();

        // CREATE
//        Customer customer = new Customer();
//        customer.setName("Chanthy tha");
//        customer.setPhone("0987654");
//        customer.setAddress("Battambang");
//        customer.setCreateBy("Admin");
//        customer.setUpdatedBy("Admin");
//
//
//        if(customerService.save(customer)){
//            System.out.println("Insert Successfully!");
//        }else {
//            System.out.println("Can not Insert!");
//        }

          //DELETE FUNCTION
//        if(customerService.delete(1)){
//            System.out.println("Delete successfully");
//        }else{
//            System.out.println("Can't  successfully");
//        }

        // UPDATE
//        Customer customer = new Customer();
//        customer.setName("Thin Chrang");
//        customer.setPhone("04455556655");
//        customer.setUpdatedBy("Chanthy");
//        customer.setId(2L);
//        if(customerService.update(customer)){
//            System.out.println("Update successfully");
//        }else{
//            System.out.println("Can not Update!");
//        }

        //FIND BY ID
//        Customer customer = customerService.findById(2);
//        if(customer !=  null){
//            System.out.println(customer.toString());
//        }else{
//            System.out.println("Not found!");
//        }

        //FINE BY NAME
//        List<Customer> customerList = customerService.findByName("Chanthy");
//        if(customerList.size() != 0){
//            for(Customer d : customerList){
//                System.out.println(d.toString());
//            }
//        }

        // GET ALL CUSTOMER
        List<Customer> customerList = customerService.findAll();
        if(customerList.size() != 0){
            for(Customer d : customerList){
                System.out.println(d.toString());
            }
        }

    }
}
