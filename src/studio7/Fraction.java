package studio7;

public class Fraction {

	private double numerator;
	private double denominator;
	
	public Fraction(double initNum, double initDenom) {
		numerator=initNum;
		denominator=initDenom;
	}
	
	public double gcf(double numerator, double denominator) {
		double q=numerator;
		double p=denominator;
		if(q != 0)
		{
			return gcf(q, p%q);
		}
		else
		{
			return p;
		}
	}
}
