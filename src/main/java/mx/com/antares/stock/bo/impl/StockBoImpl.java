package mx.com.antares.stock.bo.impl;

import mx.com.antares.stock.bo.StockBo;
import mx.com.antares.stock.dao.StockDao;
import mx.com.antares.stock.model.Stock;

public class StockBoImpl implements StockBo {

	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao){
		this.stockDao = stockDao;
	}
	
	public void save(Stock stock) {
		stockDao.save(stock);
	}

	public void update(Stock stock) {
		stockDao.update(stock);
	}

	public void delete(Stock stock) {
		stockDao.delete(stock);		
	}

	public Stock findByStockCode(String code) {
		Stock stock = stockDao.findByStockCode(code);
		return stock;
	}

}
