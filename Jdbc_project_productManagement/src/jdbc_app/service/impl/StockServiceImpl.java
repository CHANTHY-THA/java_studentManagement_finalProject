package jdbc_app.service.impl;

import jdbc_app.entity.Stock;
import jdbc_app.service.StockService;

import java.util.List;

public class StockServiceImpl implements StockService {
    @Override
    public List<Stock> findAll() {
        return null;
    }

    @Override
    public boolean save(Stock stock) {
        return false;
    }

    @Override
    public boolean update(Stock stock) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Stock findById(long id) {
        return null;
    }

    @Override
    public List<Stock> findByName(String name) {
        return null;
    }
}
