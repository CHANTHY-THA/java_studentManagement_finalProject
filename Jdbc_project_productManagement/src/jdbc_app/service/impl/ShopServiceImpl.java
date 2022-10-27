package jdbc_app.service.impl;

import jdbc_app.entity.Shops;
import jdbc_app.repository.CustomerRepository;
import jdbc_app.repository.ShopRepository;
import jdbc_app.repository.impl.CustomerRepositoryImpl;
import jdbc_app.repository.impl.ShopRepositoryImpl;
import jdbc_app.service.ShopService;

import java.util.List;

public class ShopServiceImpl implements ShopService {

    private ShopRepository shopRepository;
    public ShopServiceImpl(){
        shopRepository = new ShopRepositoryImpl();
    }
    @Override
    public List<Shops> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public boolean save(Shops shops) {
        return shopRepository.save(shops);
    }

    @Override
    public boolean update(Shops shops) {
        return shopRepository.update(shops);
    }

    @Override
    public boolean delete(long id) {
        return shopRepository.delete(id);
    }

    @Override
    public Shops findById(long id) {
        return shopRepository.findById(id);
    }

    @Override
    public List<Shops> findByName(String name) {
        return shopRepository.findByName(name);
    }
}
