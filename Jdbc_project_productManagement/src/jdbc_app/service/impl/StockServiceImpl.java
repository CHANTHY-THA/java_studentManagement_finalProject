package jdbc_app.service.impl;

import jdbc_app.entity.Stock;
import jdbc_app.repository.StockRepository;
import jdbc_app.repository.impl.StockRepositoryImpl;
import jdbc_app.service.StockService;

import java.util.List;

public class StockServiceImpl implements StockService {
    private StockRepository stockRepository;
    public StockServiceImpl(){
        stockRepository = new StockRepositoryImpl();
    }
    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public boolean save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public boolean update(Stock stock) {
        return stockRepository.update(stock);
    }

    @Override
    public boolean delete(long id) {
        return stockRepository.delete(id);
    }

    @Override
    public Stock findById(long id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<Stock> findByName(String name) {
        return stockRepository.findByName(name);
    }
}
