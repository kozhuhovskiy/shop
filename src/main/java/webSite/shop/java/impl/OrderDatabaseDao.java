package webSite.shop.java.impl;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.OrderDao;
import webSite.shop.java.models.Order;


@Repository(value="orderDatabaseDao")
public class OrderDatabaseDao extends HibernateAbstractDao<Order> implements OrderDao{

	public OrderDatabaseDao() {
		// TODO Auto-generated constructor stub
	}
	




}
