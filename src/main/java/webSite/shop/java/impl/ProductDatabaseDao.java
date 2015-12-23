package webSite.shop.java.impl;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.ProductDao;
import webSite.shop.java.models.Product;


@Repository(value="productDatabaseDao")
public class ProductDatabaseDao extends HibernateAbstractDao<Product> implements ProductDao{
	
	
	public ProductDatabaseDao (){
		
		
	}

}

	