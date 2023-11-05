package Ex7;

public class Treangle {
    private double a;
    private double b;
    private double c;

    public Treangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return result;
    }

    public double perimetr() {
        double result = a + b + c;
        return result;
    }

    public double[] centroid() {
        double centroidX = (a + b) / 3;
        double centroidY = (2 * Math.sqrt(a*a - ((b - c)*(b - c) + a*a - (b - c)*(b - c)) / 4)) / 3;
        double[] array = {centroidX, centroidY};
        return array;
    }
    
}



