package jdbc_app.service.impl;

import jdbc_app.entity.Sales;
import jdbc_app.repository.ProductRepository;
import jdbc_app.repository.SaleRepository;
import jdbc_app.repository.impl.ProductRepositoryImpl;
import jdbc_app.repository.impl.SaleRepositoryImpl;
import jdbc_app.service.SaleService;

import java.util.List;

public class SaleServiceImpl implements SaleService {
    private SaleRepository saleRepository;
    public SaleServiceImpl(){
        saleRepository = new SaleRepositoryImpl();
    }
    @Override
    public List<Sales> findAll() {
        return saleRepository.findAll();
    }

    @Override
    public boolean save(Sales sales) {
        return saleRepository.save(sales);
    }

    @Override
    public boolean update(Sales sales) {
        return saleRepository.update(sales);
    }

    @Override
    public boolean delete(long id) {
        return saleRepository.delete(id);
    }

    @Override
    public Sales findById(long id) {
        return saleRepository.findById(id);
    }

    @Override
    public List<Sales> findByName(String name) {
        return findByName(name);
    }
}
