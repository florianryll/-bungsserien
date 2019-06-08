
public class Feuerdrache extends Drache{
	@Override
	public Element spucken() {
		return Element.Feuer;
	}

	@Override
	public void angsteinjagen() {
		System.out.println("Feuerdrache jagt Angst ein");
	}
}
