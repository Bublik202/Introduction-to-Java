package Task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringFile {
	private Folder folder;
	private NewFile file;
	private String text;
	private String path;
	
	public StringFile(Folder folder, NewFile file, String text, String path) {
		super();
		this.folder = folder;
		this.file = file;
		this.text = text;
		this.path = path;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Folder getFolder() {
		return folder;
	}
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	public NewFile getFile() {
		return file;
	}
	public void setFile(NewFile file) {
		this.file = file;
	}	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	//дополняем текст
	public void addText(String name, String text) {
		byte[] bs = text.getBytes(StandardCharsets.UTF_8);
		try (FileOutputStream stream = new FileOutputStream(path+name)){
			stream.write(' ');
			stream.write(bs);	
			stream.close();
		} catch (IOException exception) {
			System.out.println("Error copy text");
		}	
	}
	
	//Записываем текст
	public void write(String name) {
		byte[] bs = text.getBytes(StandardCharsets.UTF_8);
		try (FileOutputStream stream = new FileOutputStream(path+name)){
			stream.write(bs);		
			stream.close();
		 } catch (FileNotFoundException e) {
	            System.err.println("File no found: " + path + name + e.getMessage());
	     } catch (IOException e) {
	            System.err.println("Error writing text to a file: " + e.getMessage());
	     }
	}
	
	//Читать текст
	public void read(String name) {
		try (FileInputStream stream = new FileInputStream(path+name)){
			int symbol;
			while((symbol = stream.read()) != -1) {
				System.out.print((char)symbol);
			}
			stream.close();
		} catch (IOException exception) {
			System.out.println("Error read " + exception.getMessage());
		}
	}
	
	//Удаления текста
	public void deleteText(String name) {
		try (FileOutputStream stream = new FileOutputStream(path+name)){
			stream.write(new byte[0]);
			stream.close();
		} catch (IOException e) {
			System.out.println("Error delete " + e.getMessage());
		}
	}

}
