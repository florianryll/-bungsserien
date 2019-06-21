
public class GleichseitigesDreieck extends DreieckArten {

	

	public GleichseitigesDreieck(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double hoehe() {
		return Math.pow(3, 1/3)*a/2;
	}

	@Override
	public double berechneWinkel() {
		return 60*this.pi/180;
	}

}
