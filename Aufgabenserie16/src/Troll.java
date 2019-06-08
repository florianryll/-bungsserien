
public class Troll extends SpielCharakter implements Monster,Held{

	@Override
	public void heldenhaftPosieren() {
		System.out.println("Troll");
	}

	@Override
	public void angsteinjagen() {
		System.out.println("Troll schreit");
	}

}
