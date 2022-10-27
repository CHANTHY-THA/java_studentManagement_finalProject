package jdbc_app.controller;

import jdbc_app.entity.Customer;
import jdbc_app.entity.Vendors;
import jdbc_app.service.VendorService;
import jdbc_app.service.impl.VendorServiceImpl;

import java.util.List;

public class VendorController {
    public static void main(String[] args) {

        VendorService vendorService = new VendorServiceImpl();

        // CREATE
//        Vendors vendors = new Vendors();
//        vendors.setName("Lyhour");
//        vendors.setCreateBy("Admin");
//        vendors.setUpdatedBy("Admin");
//
//
//        if(vendorService.save(vendors)){
//            System.out.println("Insert Successfully!");
//        }else {
//            System.out.println("Can not Insert!");
//        }

        //DELETE FUNCTION
//        if(vendorService.delete(1)){
//            System.out.println("Delete successfully");
//        }else{
//            System.out.println("Can't  successfully");
//        }

        // UPDATE
//        Vendors vendors1 = new Vendors();
//        vendors1.setName("Thin Chrang");
//        vendors1.setUpdatedBy("Chanthy");
//        vendors1.setId(2L);
//        if(vendorService.update(vendors1)){
//            System.out.println("Update successfully");
//        }else{
//            System.out.println("Can not Update!");
//        }

        //FIND BY ID
//        Vendors vendors = vendorService.findById(2);
//        if(vendors !=  null){
//            System.out.println(vendors.toString());
//        }else{
//            System.out.println("Not found!");
//        }

        //FINE BY NAME
//        List<Vendors> vendorsList = vendorService.findByName("Chanthy");
//        if(vendorsList.size() != 0){
//            for(Vendors v : vendorsList){
//                System.out.println(v.toString());
//            }
//        }

        // GET ALL CUSTOMER
        List<Vendors> vendorsList = vendorService.findAll();
        if(vendorsList.size() != 0){
            for(Vendors v : vendorsList){
                System.out.println(v.toString());
            }
        }
    }
}
