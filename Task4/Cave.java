package Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cave {
	private static Scanner scanner = new Scanner(System.in);
	private Treasure[] trash;
	private static final String PATH = "src/Task4/TreasureFolder/TreasureFile.txt";
	private double card;
	private int count = 0;
	
	public Cave() {
		trash = new Treasure[100];
		card = 1000.00;
	}
	
		
	public void allTreasure() {
		try (FileInputStream stream = new FileInputStream(PATH)){
			int symbol;		
			while((symbol = stream.read()) != -1) {
				System.out.print((char)symbol);
			}
			System.out.println("\n");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	public void mostExpensive() {
	    Treasure result = null;
	    File file = new File(PATH);
	    try {       
	        FileReader fileReader = new FileReader(file);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String line;
	        double max = Integer.MIN_VALUE;
	        while ((line = bufferedReader.readLine()) != null) {           
	            String[] arr = splitLine(line);

	            if (arr.length >= 2 && arr[1] != null) {
	                try {
	                    Treasure treasure = new Treasure(String.valueOf(arr[0]), Double.valueOf(arr[1]));
	                    if (max < treasure.getCost()) {
	                        max = treasure.getCost();
	                        result = treasure;
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Error parsing double: " + arr[1]);
	                }
	           }
	        }

	        bufferedReader.close();
	        fileReader.close();
	    } catch (IOException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println(result+"\n");
	}
	
	public void mostСheap() {
	    Treasure result = null;
	    try {       
	        FileReader fileReader = new FileReader(new File(PATH));
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String line;
	        double min = Integer.MAX_VALUE;
	        while ((line = bufferedReader.readLine()) != null) {           
	            String[] arr = splitLine(line);

	            if (arr.length >= 2 && arr[1] != null) {
	                try {
	                    Treasure treasure = new Treasure(String.valueOf(arr[0]), Double.valueOf(arr[1]));
	                    if (min > treasure.getCost()) {
	                        min = treasure.getCost();
	                        result = treasure;
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Error parsing double: " + arr[1]);
	                }
	            }
	        }

	        bufferedReader.close();
	        fileReader.close();
	    } catch (IOException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println(result+"\n");
	}
	
	private String[] splitLine(String line) {
		String regex = "^(.+)\\s(\\d+\\.?\\d+)$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(line);
        
        String[] arr = new String[2];
        if (matcher.find()) {
            String textPart = matcher.group(1);
            String numberPart = matcher.group(2);
            
            arr[0] = textPart;
            arr[1] = numberPart;		
        }   
        return arr;
	}
	
	public void payTreasure() {		
		String product = inputProduct();
		
		try (FileReader fileReader = new FileReader(new File(PATH));
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			Treasure treasure = null;
			while ((line = bufferedReader.readLine()) != null) {			
				
				String[] arr = splitLine(line);			
				
				if(arr[0].equalsIgnoreCase(product)) {
					treasure = new Treasure(arr[0], Double.valueOf(arr[1]));
					if(card >= treasure.getCost()) {
						card -= treasure.getCost();
						this.trash[count++] = treasure;	
						System.out.println("Success " + product);
					}else {
						System.out.println("You don't have money to this treasure!");
					}					
				}
			}	
			
			
		}catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }		
		
	}


	public void watchTrash() {
		if(trash != null) {
			Treasure[] newTrash = Arrays.copyOf(trash, count);
	        
			for (Treasure t : newTrash) {
				System.out.println(t);
			}
			System.out.println("Your money: "+card);
			
		}else {
			System.out.println("No pay ");
		}
	}

	private String inputProduct() {
	    System.out.print("input name treasure: ");
	    return scanner.nextLine().trim();
	}

	
	public void menu() {
		Actions[] menu = Actions.values();
		int nMenu = inNumberMenu();
		menu[nMenu-1].start();
		 
	}


	private int inNumberMenu() {
		System.out.println("Input 1 if to see All treasure");
		System.out.println("Input 2 if to see the most expensive treasure");
		System.out.println("Input 3 if to see the most cheap treasure");		
		System.out.println("Input 4 if to see chosse treasure");	
		System.out.println("Input 5 if to check your money");
		System.out.println("Input 6 if to exit");
		System.out.print("Your number -> ");
		
		int nMenu = -1;
        try {
        	 while (!scanner.hasNextInt()) {
                 System.out.println("Invalid input. Please enter a number.");
                 scanner.nextLine();  // Очистка буфера
                 System.out.print("Your number -> ");
             }          
             nMenu = scanner.nextInt();
             scanner.nextLine(); 
             
//        	String input = scanner.nextLine();    	
//          nMenu = Integer.parseInt(input.trim());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        return nMenu;
	}
	
}
