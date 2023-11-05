package Ex7;

public class TreangleMain {

	public static void main(String[] args) {
		Treangle treangle = new Treangle(2, 3, 4);
		System.out.println("Treangle area: " + treangle.area());
        System.out.println("Treangle perimetr: " + treangle.perimetr());
        double[] centroid = treangle.centroid();
        System.out.println("centroid: (" + centroid[0] + ", " + centroid[1] + ")");
	}

}
