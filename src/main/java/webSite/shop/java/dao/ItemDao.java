package webSite.shop.java.dao;

import java.util.List;

import webSite.shop.java.models.Model;

public interface ItemDao <T extends Model>{
	
	public List<T> getAll();
	public T getById(Long id);
	
	
	public void add (T model);
	
	public void update(T model);
	
	public void remove(T model);

	
	

}
