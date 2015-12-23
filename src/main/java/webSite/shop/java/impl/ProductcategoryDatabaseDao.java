package webSite.shop.java.impl;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.ProductCategoryDao;
import webSite.shop.java.models.ProductCategory;



@Repository(value="productcategoryDatabaseDao")
public class ProductcategoryDatabaseDao extends HibernateAbstractDao<ProductCategory> implements ProductCategoryDao{

	public ProductcategoryDatabaseDao(){
		
	}
	
	
	
	
	
}
