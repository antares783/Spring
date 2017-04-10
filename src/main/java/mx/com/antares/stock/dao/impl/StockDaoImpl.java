package mx.com.antares.stock.dao.impl;

import mx.com.antares.stock.dao.StockDao;
import mx.com.antares.stock.model.Stock;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);

	}

	public Stock findByStockCode(String code) {
		@SuppressWarnings("rawtypes")
		List list = getHibernateTemplate().find("from Stock where stockCode=?",code);
		return (Stock) list.get(0);
	}

}
