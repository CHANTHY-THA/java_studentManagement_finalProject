package jdbc_app.service.impl;

import jdbc_app.entity.Vendors;
import jdbc_app.service.VendorService;

import java.util.List;

public class VendorServiceImpl implements VendorService {
    @Override
    public List<Vendors> findAll() {
        return null;
    }

    @Override
    public boolean save(Vendors vendors) {
        return false;
    }

    @Override
    public boolean update(Vendors vendors) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Vendors findById(long id) {
        return null;
    }

    @Override
    public List<Vendors> findByName(String name) {
        return null;
    }
}
