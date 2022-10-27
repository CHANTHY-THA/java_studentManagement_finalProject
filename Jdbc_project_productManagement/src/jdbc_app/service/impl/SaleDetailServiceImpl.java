package jdbc_app.service.impl;

import jdbc_app.entity.SaleDetail;
import jdbc_app.repository.SaleDetailRepository;
import jdbc_app.repository.impl.SaleDetailRepositoryImpl;
import jdbc_app.repository.impl.StockRepositoryImpl;
import jdbc_app.service.SaleDetailService;

import java.util.List;

public class SaleDetailServiceImpl implements SaleDetailService {

    private SaleDetailRepository saleDetailRepository;
    public SaleDetailServiceImpl(){
        saleDetailRepository = new SaleDetailRepositoryImpl();
    }
    @Override
    public List<SaleDetail> findAll() {
        return saleDetailRepository.findAll();
    }

    @Override
    public boolean save(SaleDetail saleDetail) {
        return saleDetailRepository.save(saleDetail);
    }

    @Override
    public boolean update(SaleDetail saleDetail) {
        return saleDetailRepository.update(saleDetail);
    }

    @Override
    public boolean delete(long id) {
        return saleDetailRepository.delete(id);
    }

    @Override
    public SaleDetail findById(long id) {
        return saleDetailRepository.findById(id);
    }

    @Override
    public List<SaleDetail> findByName(String name) {
        return saleDetailRepository.findByName(name);
    }
}
