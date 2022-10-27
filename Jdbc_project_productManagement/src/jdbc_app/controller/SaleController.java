package jdbc_app.controller;

import jdbc_app.service.SaleService;
import jdbc_app.service.impl.SaleServiceImpl;

public class SaleController {
    public static void main(String[] args) {
        SaleService saleService = (SaleService) new SaleServiceImpl();
    }
}
