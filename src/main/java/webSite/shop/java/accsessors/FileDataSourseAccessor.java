package webSite.shop.java.accsessors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class FileDataSourseAccessor {
	
	public BufferedReader load() throws FileNotFoundException{
		File file = new File(this.getDatasourceName());
		return new BufferedReader(new FileReader(file));
		
	}

	public abstract String getDatasourceName();

}
