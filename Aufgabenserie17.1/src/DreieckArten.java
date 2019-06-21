
public abstract class DreieckArten implements FlaechenInhalt{
	double a;
	double b;
	double c;
	
	public DreieckArten(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double flaeche(){
		return 1/2*this.hoehe()*this.getG();
	}

	private double getG() {
		double longest = a;
		if(b>longest) {
			longest=b;
		}if(c>longest) {
			longest=c;
		}
		return longest;
	}
	
	public double winkel() {
		return Math.acos((a*a-b*b-c*c)/(-2*a*b));
	}
	public abstract double berechneWinkel();
	
	public double umfang() {
		return a+b+c;
	}
}