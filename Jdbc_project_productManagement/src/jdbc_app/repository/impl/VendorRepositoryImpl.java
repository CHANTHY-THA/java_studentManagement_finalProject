package jdbc_app.repository.impl;

import jdbc_app.entity.Vendors;
import jdbc_app.repository.VendorRepository;

import java.util.List;

public class VendorRepositoryImpl implements VendorRepository {
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
