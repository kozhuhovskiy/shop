package webSite.shop.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webSite.shop.java.dao.ProductDao;
import webSite.shop.java.models.Product;

@Service(value="producrService")
public class ProductService {
	@Autowired
	@Qualifier("productDatabaseDao")
	private ProductDao productDao;
	
public ProductService() {
	// TODO Auto-generated constructor stub
}
@Transactional
	public List<Product> getAll(){
		return productDao.getAll();
	}
}
