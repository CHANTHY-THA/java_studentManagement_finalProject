package jdbc_app.service.impl;

import jdbc_app.entity.Vendors;
import jdbc_app.repository.ShopRepository;
import jdbc_app.repository.VendorRepository;
import jdbc_app.repository.impl.ShopRepositoryImpl;
import jdbc_app.repository.impl.VendorRepositoryImpl;
import jdbc_app.service.VendorService;

import java.util.List;

public class VendorServiceImpl implements VendorService {
    private VendorRepository vendorRepository;
    public VendorServiceImpl(){
        vendorRepository = new VendorRepositoryImpl();
    }
    @Override
    public List<Vendors> findAll() {
        return vendorRepository.findAll();
    }

    @Override
    public boolean save(Vendors vendors) {
        return vendorRepository.save(vendors);
    }

    @Override
    public boolean update(Vendors vendors) {
        return vendorRepository.update(vendors);
    }

    @Override
    public boolean delete(long id) {
        return vendorRepository.delete(id);
    }

    @Override
    public Vendors findById(long id) {
        return vendorRepository.findById(id);
    }

    @Override
    public List<Vendors> findByName(String name) {
        return vendorRepository.findByName(name);
    }
}
