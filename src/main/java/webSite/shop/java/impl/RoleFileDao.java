package webSite.shop.java.impl;

import java.util.List;

import org.springframework.stereotype.Repository;


import webSite.shop.java.dao.RoleDao;
import webSite.shop.java.models.Role;



@Repository(value="roleFileDao")


public class RoleFileDao extends FileAbstractDao<Role> implements RoleDao{

	
	public RoleFileDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}
}
	