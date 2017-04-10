/**
 * 
 */
package mx.com.antares.stock.model;

import java.io.Serializable;

/**
 * @author ICastro
 *
 */
public class Stock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long  stockId;
	private String stockName;
	private String stockCode;
	
	public Stock(){}
	
	public Stock(String stockName, String stockCode) {
		super();
		this.stockName = stockName;
		this.stockCode = stockCode;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", stockCode=" + stockCode + "]";
	}
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
}
