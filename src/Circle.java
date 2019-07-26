import java.lang.Math;

public class Circle {
	private double radius;
	public Circle(double _radius) {
		radius = _radius;
	}
	public double getCircumference() {
		return (2*Math.PI)*radius; 
	}
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
		//return Double.toString(Math.round(x*100)/100);
	}
	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference());
	}
	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
	}
}
