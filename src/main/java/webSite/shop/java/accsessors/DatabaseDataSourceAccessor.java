package webSite.shop.java.accsessors;

import javax.sql.DataSource;

public abstract class DatabaseDataSourceAccessor {
	
	public DataSource load(){
		return null;
	}
	
	
	public abstract String getHost();
	public abstract String getPort();

}
