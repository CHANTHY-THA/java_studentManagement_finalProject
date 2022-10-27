package jdbc_app.controller;

import jdbc_app.service.ProductService;
import jdbc_app.service.impl.ProductServiceImpl;

public class ProductController {
    public static void main(String[] args) {
        ProductService productService = (ProductService) new ProductServiceImpl();
    }
}
