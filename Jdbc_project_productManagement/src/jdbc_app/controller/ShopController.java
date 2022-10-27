package jdbc_app.controller;

import jdbc_app.service.ShopService;
import jdbc_app.service.impl.ShopServiceImpl;

public class ShopController {
    public static void main(String[] args) {
        ShopService shopService = new ShopServiceImpl();
    }
}
