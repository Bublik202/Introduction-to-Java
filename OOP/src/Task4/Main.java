package Task4;

public class Main {

	public static void main(String[] args) {
		Cave cave = new Cave();
		Actions.setCave(cave);		
		
		while(!Actions.isExit) {
			cave.menu();
		}				
		
	}

}
