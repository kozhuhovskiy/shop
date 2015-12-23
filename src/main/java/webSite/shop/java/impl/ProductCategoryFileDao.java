package webSite.shop.java.impl;

import java.util.List;

import webSite.shop.java.dao.ProductCategoryDao;
import webSite.shop.java.models.ProductCategory;

public class ProductCategoryFileDao extends FileAbstractDao<ProductCategory> implements ProductCategoryDao {

	
	public ProductCategoryFileDao (){
		
	}
	
	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategory getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}

}
