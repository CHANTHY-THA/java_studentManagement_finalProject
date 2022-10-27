package jdbc_app.controller;

import jdbc_app.service.VendorService;
import jdbc_app.service.impl.VendorServiceImpl;

public class VendorController {
    public static void main(String[] args) {
        VendorService vendorService = new VendorServiceImpl();
    }
}
