package jdbc_app.repository.impl;

import jdbc_app.entity.Shops;
import jdbc_app.repository.ShopRepository;

import java.util.List;

public class ShopRepositoryImpl implements ShopRepository {
    @Override
    public List<Shops> findAll() {
        return null;
    }

    @Override
    public boolean save(Shops shops) {
        return false;
    }

    @Override
    public boolean update(Shops shops) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Shops findById(long id) {
        return null;
    }

    @Override
    public List<Shops> findByName(String name) {
        return null;
    }
}
