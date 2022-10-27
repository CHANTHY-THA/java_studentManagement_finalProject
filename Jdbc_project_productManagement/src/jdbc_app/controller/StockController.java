package jdbc_app.controller;

import jdbc_app.service.StockService;
import jdbc_app.service.impl.StockServiceImpl;

public class StockController {
    public static void main(String[] args) {
        StockService stockService = new StockServiceImpl();
    }
}
