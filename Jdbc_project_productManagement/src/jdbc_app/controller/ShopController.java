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
//        Shops shops = new Shops();
//        shops.setName("Real Studio");
//        shops.setAddress("PP");
//        shops.setCreateBy("Admin");
//        shops.setUpdatedBy("Admin");
//
////
//        if(shopService.save(shops)){
//            System.out.println("Insert Successfully!");
//        }else {
//            System.out.println("Can not Insert!");
//        }

        //DELETE FUNCTION
//        if(shopService.delete(1)){
//            System.out.println("Delete successfully");
//        }else{
//            System.out.println("Can't  successfully");
//        }

        // UPDATE
//        Shops shops = new Shops();
//        shops.setName("Thin Chrang");
//        shops.setAddress("Phnom Penh");
//        shops.setUpdatedBy("Chanthy");
//        shops.setId(1L);
//        if(shopService.update(shops)){
//            System.out.println("Update successfully");
//        }else{
//            System.out.println("Can not Update!");
//        }

        //FIND BY ID
//        Shops shops = shopService.findById(2);
//        if(shops !=  null){
//            System.out.println(shops.toString());
//        }else{
//            System.out.println("Not found!");
//        }

        //FINE BY NAME
//        List<Shops> shopsList = shopService.findByName("Kh");
//        if(shopsList.size() != 0){
//            for(Shops s : shopsList){
//                System.out.println(s.toString());
//            }
//        }

        // GET ALL SHOPS
        List<Shops> shopsList = shopService.findAll();
        if(shopsList.size() != 0){
            for(Shops d : shopsList){
                System.out.println(d.toString());
            }
        }

    }
}
