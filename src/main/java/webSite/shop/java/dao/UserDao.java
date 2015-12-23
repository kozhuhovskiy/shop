package webSite.shop.java.dao;

import webSite.shop.java.models.User;

public interface UserDao extends ItemDao<User> {
	
	public User getByUsername(String username);
	

}
