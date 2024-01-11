package Task1;

import java.io.File;
import java.io.IOException;

public class NewFile {
	private String name;
	private String path;
	
	public NewFile(String path) {
		super();
		this.path = path;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	//создаем файл
	public File makeFile(String name){				
		File file = new File(path+name);
		try {
			file.createNewFile();
		} catch (IOException exception) {
			System.out.println("Error make file");		
		}	
		return file;
	}
	
	//создаем файл в каталоге
	public void makeFileCatalog(String catalog, String name){		
		Folder folder = new Folder(path);
		folder.makeCatalog(catalog);
		
		makeFile(catalog+"/"+name);
	}

	//Переименовываем файл
	public void renamed(String nameRen, String newName){
		 File renFile = new File(path + nameRen);
		 if (renFile.exists()){
			 File newFile = new File(path + newName);
			 renFile.renameTo(newFile);
		 }else {
			 makeFile(newName);
		 }
	}
	
	//удаляем файл
	public void deleteFail(String name) {
		File file = new File(path+name);
		if(file.exists()) {
			file.delete();
			System.out.println("File deleted successfully: " + name);
		}else {
			 System.err.println("File not found: " + name);		
		}
	}
		
}
