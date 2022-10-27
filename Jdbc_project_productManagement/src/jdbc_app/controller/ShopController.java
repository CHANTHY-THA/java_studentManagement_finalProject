package jdbc_app.controller;

import jdbc_app.entity.Customer;
import jdbc_app.entity.Shops;
import jdbc_app.service.ShopService;
import jdbc_app.service.impl.ShopServiceImpl;

import java.util.List;

public class ShopController {
    public static void main(String[] args) {
        ShopService shopService = new ShopServiceImpl();

        // CREATE
        Shops shops = new Shops();
        shops.setName("Khmer Computer");
        shops.setAddress("Battambang");
        shops.setCreateBy("Admin");
        shops.setUpdatedBy("Admin");

//
        if(shopService.save(shops)){
            System.out.println("Insert Successfully!");
        }else {
            System.out.println("Can not Insert!");
        }

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
//        Customer department = customerService.findById(2);
//        if(department !=  null){
//            System.out.println(department.toString());
//        }else{
//            System.out.println("Not found!");
//        }

        //FINE BY NAME
//        List<Customer> departmentList = customerService.findByName("Chanthy");
//        if(departmentList.size() != 0){
//            for(Customer d : departmentList){
//                System.out.println(d.toString());
//            }
//        }

        // GET ALL SHOPS
//        List<Shops> shopsList = shopService.findAll();
//        if(shopsList.size() != 0){
//            for(Shops d : shopsList){
//                System.out.println(d.toString());
//            }
//        }

    }
}
