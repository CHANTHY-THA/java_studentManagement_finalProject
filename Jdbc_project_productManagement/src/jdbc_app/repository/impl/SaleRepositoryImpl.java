package jdbc_app.repository.impl;

import jdbc_app.entity.Sales;
import jdbc_app.repository.SaleRepository;

import java.util.List;

public class SaleRepositoryImpl implements SaleRepository {
    @Override
    public List<Sales> findAll() {
        return null;
    }

    @Override
    public boolean save(Sales sales) {
        return false;
    }

    @Override
    public boolean update(Sales sales) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Sales findById(long id) {
        return null;
    }

    @Override
    public List<Sales> findByName(String name) {
        return null;
    }
}
