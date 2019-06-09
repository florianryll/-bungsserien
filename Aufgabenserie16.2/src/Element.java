import java.util.Random;

public class Element implements RingElement {
	Element successor;
	int id;

	public Element() {
		Random rng = new Random();
		this.id = rng.nextInt();
	}
	
	@Override
	public Element next() {
		return successor;
	}

	@Override
	public void insertAfter() {
		Element insert = new Element();
		insert.setSuccessor(successor);
		this.setSuccessor(insert);
	}

	@Override
	public void delete() {
		Element tmp = successor;
		while (tmp.next() != this) {
			tmp = tmp.next();
		}
		tmp.setSuccessor(this.next());
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setSuccessor(Element successor) {
		this.successor = successor;
	}

}
