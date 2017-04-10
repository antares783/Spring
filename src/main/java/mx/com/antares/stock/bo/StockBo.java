package mx.com.antares.stock.bo;

import mx.com.antares.stock.model.Stock;

public interface StockBo {

	public void save(Stock stock);
	public void update(Stock stock);
	public void delete(Stock stock);
	public Stock findByStockCode(String code);
}
