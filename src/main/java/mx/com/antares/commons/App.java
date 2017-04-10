package mx.com.antares.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.antares.stock.bo.StockBo;
import mx.com.antares.stock.model.Stock;



public class App {

	public static void main(String [] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		StockBo stockBo= (StockBo) applicationContext.getBean("stockBo");
		
		System.out.print("holas");
		
		/*
		 * pruebas sobre git hub
		 */
		
//		insert
		Stock stock = new Stock();
		stock.setStockCode("7668");
		stock.setStockName("Hola");
		stockBo.save(stock);
		
//		select
		Stock stock2 = stockBo.findByStockCode("7668");
		System.out.println(stock2);
		
//		update
		stock2.setStockName("Hola 2");
		stockBo.update(stock2);
		
//		delete
		stockBo.delete(stock2);
		System.out.println("Termino");
		
	}
	
}
