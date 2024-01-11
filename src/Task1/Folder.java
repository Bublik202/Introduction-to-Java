package Task1;

import java.io.File;

public class Folder {
	private String path;

	public Folder(String path){
		super();
		this.path = path;		
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	public String getPath() {
		return path;
	}

	//Создаем каталог
	public void makeCatalog(String catalogs){
		File file = new File(path+catalogs);
		if(!file.exists()) {
			file.mkdir();
		}	
	}
}
