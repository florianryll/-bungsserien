
public class GleichschenkligesDreieck extends DreieckArten {

	public GleichschenkligesDreieck(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double hoehe() {
		return Math.sqrt(a*a-Math.pow(c/2, 2));
	}

	@Override
	public double berechneWinkel() {
		return Math.acos(1-(c*c/2*a*a));
	}

}
