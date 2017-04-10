package mx.com.antares.stock.dao;

import mx.com.antares.stock.model.Stock;

public interface StockDao {
	
	public void save(Stock stock);
	public void update(Stock stock);
	public void delete(Stock stock);
	public Stock findByStockCode(String code);

}
