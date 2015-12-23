package webSite.shop.java.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.ProductDao;
import webSite.shop.java.models.Product;


@Repository(value="productFileDao")
public class ProductFileDao  extends FileAbstractDao<Product> implements ProductDao {

	
	public ProductFileDao (){
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}
}
	