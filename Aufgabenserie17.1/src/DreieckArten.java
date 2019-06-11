
public abstract class DreieckArten implements FlaechenInhalt{
	double a;
	double b;
	double c;
	
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
		return a;
		
	}
}
