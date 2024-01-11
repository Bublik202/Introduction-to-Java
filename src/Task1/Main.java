package Task1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {	
		String text = "Good morning my neighbors";
		String path = "src/Task1/";		
				
		Folder folder = new Folder(path);	
		folder.makeCatalog("Catalog");
		
		NewFile newFile = new NewFile(path);
		newFile.makeFile("File_1.txt");
		newFile.makeFileCatalog("Catalog","CatFile.txt");
		newFile.makeFileCatalog("Catalog 10","NewCatFile.txt");
		newFile.renamed("File_2.txt", "RenamedFile.txt");
		
		StringFile stringFile = new StringFile(folder,newFile,text,path);
		stringFile.write("File_1.txt"); //Записываю текст
		stringFile.read("File_1.txt"); //Прочитываю текст
		stringFile.addText("File_1.txt", "Whats up"); //дополняю текст
		stringFile.read("File_1.txt"); //Читаю дополненный текст
		stringFile.deleteText("File_1.txt"); //Удаляю текст
		System.out.println("\n");
		newFile.deleteFail("File_1.txt"); //Удаляю файл
	
	}

}
