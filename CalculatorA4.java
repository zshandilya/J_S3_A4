
public class CalculatorA4 {

	private double a;
	private double b;
	
	CalculatorA4(double x, double y) {
		a=x;
		b=y;
	}
	
	public double add() {
		return a+b;
	}
	
	public double subtract() {
		return a-b;
	}
	
	public double multiply() {
		return a*b;
	}
	
	public double divide() {
		return a/b;
	}
	
	public double power() {
		return Math.pow(a,b);
	}
	
	public double root() {
		return Math.pow(a,1/b);
	}
}
