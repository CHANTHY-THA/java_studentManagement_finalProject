package jdbc_app.controller;

import jdbc_app.service.SaleService;
import jdbc_app.service.impl.SaleServiceImpl;

public class Sale {
    public static void main(String[] args) {
        SaleService saleService = (SaleService) new SaleServiceImpl();
    }
}
