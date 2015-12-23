package webSite.shop.java.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.OrderDao;
import webSite.shop.java.models.Order;


@Repository(value="orderFileDao")
public class OrderFileDao extends FileAbstractDao<Order> implements OrderDao{

	
	public OrderFileDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}

}
