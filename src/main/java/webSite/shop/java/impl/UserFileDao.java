package webSite.shop.java.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import webSite.shop.java.dao.UserDao;
import webSite.shop.java.models.User;




@Repository ("userFileDao")

public class UserFileDao extends FileAbstractDao<User> implements UserDao{
	
	public UserFileDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
