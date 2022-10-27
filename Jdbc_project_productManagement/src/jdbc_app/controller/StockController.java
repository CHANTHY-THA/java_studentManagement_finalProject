package jdbc_app.controller;

import jdbc_app.entity.Stock;
import jdbc_app.entity.Vendors;
import jdbc_app.service.StockService;
import jdbc_app.service.impl.StockServiceImpl;

import java.util.List;

public class StockController {
    public static void main(String[] args) {
        StockService stockService = new StockServiceImpl();
        // CREATE
//        Stock stock = new Stock();
//        stock.setProduct_id(1L);
//        stock.setShop_id(2L);
//        stock.setQuantity(5);
//        stock.setProduct_id(1L);
//        stock.setCreateBy("Admin");
//        stock.setUpdatedBy("Admin");
//
//
//        if(stockService.save(stock)){
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
        List<Stock> stockList = stockService.findAll();
        if(stockList.size() != 0){
            for(Stock s : stockList){
                System.out.println(s.toString());
            }
        }
    }
}
