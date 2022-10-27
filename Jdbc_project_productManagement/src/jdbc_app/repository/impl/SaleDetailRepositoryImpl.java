package jdbc_app.repository.impl;

import jdbc_app.entity.SaleDetail;
import jdbc_app.repository.SaleDetailRepository;

import java.util.List;

public class SaleDetailRepositoryImpl implements SaleDetailRepository {
    @Override
    public List<SaleDetail> findAll() {
        return null;
    }

    @Override
    public boolean save(SaleDetail saleDetail) {
        return false;
    }

    @Override
    public boolean update(SaleDetail saleDetail) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public SaleDetail findById(long id) {
        return null;
    }

    @Override
    public List<SaleDetail> findByName(String name) {
        return null;
    }
}
