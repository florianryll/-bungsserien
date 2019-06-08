
public class Eisdrache extends Drache{

	@Override
	public Element spucken() {
		return Element.Eis;
	}

	@Override
	public void angsteinjagen() {
		System.out.println("Eisdrache jagt Angst ein");
	}

}
